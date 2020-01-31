/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        
        Node ptr = head;
        while(ptr != null) {
            Node node = new Node(ptr.val);
            node.next = ptr.next;
            ptr.next = node;
            ptr = ptr.next.next;
        }
        
        ptr = head;
        while(ptr != null) {
            if(ptr.random != null) {
                ptr.next.random = ptr.random.next;
            }
            ptr = ptr.next.next;
        }
        
        Node old_ptr = head;
        Node new_ptr = head.next;
        Node copy = head.next;
        while(old_ptr != null) {
            old_ptr.next = old_ptr.next.next;
            old_ptr = old_ptr.next;
            if(old_ptr != null) {
                new_ptr.next = old_ptr.next;
            }
            new_ptr = new_ptr.next;
        }
        
        return copy;
    }
}
