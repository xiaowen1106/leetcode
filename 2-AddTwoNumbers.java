/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int rest) {
        if(l1 == null && l2 == null && rest == 0){
            return null;
        }
        int val1 = 0;
        ListNode next1 = null;
        int val2 = 0;
        ListNode next2 = null;
        if(l1 != null){
            val1 = l1.val;
            next1 = l1.next;
        }
        if(l2 != null){
            val2 = l2.val;
            next2 = l2.next;
        }
        int current = val1 + val2 + rest;
        rest = current / 10;
        ListNode output = new ListNode(current - rest * 10);
        output.next = addTwoNumbers(next1, next2, rest);
        return output;        
    }
}
