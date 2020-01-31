/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private Comparator<ListNode> listNodeComparator = new Comparator<ListNode>() {
        public int compare(ListNode l1, ListNode l2){
            return l1.val - l2.val;
        }
    };
    
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue= new PriorityQueue<>(listNodeComparator);
        
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                queue.offer(lists[i]);
                lists[i] = lists[i].next;
            }
        }
        
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            curr.next = new ListNode(node.val);
            curr = curr.next;
            if(node.next != null) {
                queue.offer(node.next);
            }
        }
        
        return dummyHead.next;
    }
}
