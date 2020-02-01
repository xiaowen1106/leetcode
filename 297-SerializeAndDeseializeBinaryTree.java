/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder(); 
        
        if(root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null) {
                sb.append(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                sb.append("#");
            }
            sb.append(",");
        }
        
        // remove tailing sharp and comma
        /*for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '#' || sb.charAt(i) == ',') {
                sb.deleteCharAt(i);
            } else {
                break;
            }
        }*/
        
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;
        String[] vals = data.split(",");
        
        TreeNode[] nodes = new TreeNode[vals.length];
        for(int i = 0; i < vals.length; i ++){
            if("#".equals(vals[i]) || "".equals(vals[i])){
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(Integer.valueOf(vals[i]));
            }
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(nodes[0]);
        int i = 1;
        while(!queue.isEmpty() && i < nodes.length) {
            TreeNode node = queue.poll();
            if(node != null) {
                node.left = nodes[i++];
                queue.offer(node.left);
                node.right = nodes[i++];
                queue.offer(node.right);
            }
        }
        
        return nodes[0];
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
