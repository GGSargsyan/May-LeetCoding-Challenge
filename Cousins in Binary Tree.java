/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        
        TreeNode pX = null;
        TreeNode pY = null;
        
        while(!nodes.isEmpty()){
            int size = nodes.size();
            for(int i = 0; i <size; i++){
                TreeNode curr = nodes.poll();
                
                if(curr.left != null){
                    nodes.add(curr.left);
                    if(curr.left.val == x)
                        pX = curr;
                    if(curr.left.val == y)
                        pY = curr;
                }
                if(curr.right != null){
                    nodes.add(curr.right);
                    if(curr.right.val == y)
                        pY = curr;
                    if(curr.right.val == x)
                        pX = curr;
                }
            }
            if(pX != null || pY != null)
                break;
        }
        return (pX != pY && pX != null && pY != null);
    }
}