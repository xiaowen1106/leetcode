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
        Map<Node, Node> created = new HashMap<>();
        
        Node ptr = head;
        while(ptr != null){
            created.put(ptr, new Node(ptr.val));
            ptr = ptr.next;
        }
        
        ptr = head;
        while(ptr != null){
            Node node = created.get(ptr);
            node.next = created.get(ptr.next);
            node.random = created.get(ptr.random);
            ptr = ptr.next;
        }
        
        return created.get(head);
    }
}
