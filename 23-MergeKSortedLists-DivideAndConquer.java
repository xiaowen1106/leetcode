/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size == 0) return null;
        if(size == 1) return lists[0];
        
        int mid = size / 2;
        ListNode left = mergeKLists(Arrays.copyOfRange(lists, 0, mid));
        ListNode right = mergeKLists(Arrays.copyOfRange(lists, mid, size));
        return merge(left, right);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode node;
        if(l1.val < l2.val) {
            node = new ListNode(l1.val);
            node.next = merge(l1.next, l2);
        }else{
            node = new ListNode(l2.val);
            node.next = merge(l1, l2.next);
        }
        return node;
    }
    
    /*private ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        if(l1 != null) {
            curr.next = l1;
        }
    
        if(l2 != null){
            curr.next = l2;
        }
        
        return head.next;
    }*/
    
}
