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
    public boolean isBalanced(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        helper(res , root);
        return res[0];
    }
    private int helper(boolean[] b, TreeNode root){
        if (root == null) return 0;
        if (b[0] == false) return 0;
        int left = helper(b , root.left);
        int right = helper(b , root.right);
        if (Math.abs (left-right) > 1){
            b[0] = false;
        }
        return 1 + Math.max(left , right);
    }
}
