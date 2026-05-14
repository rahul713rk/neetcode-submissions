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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dfs(root , target);
    }
    private TreeNode dfs(TreeNode root , int t){
        if (root == null) return null;
        if (root.left != null){
            root.left = dfs(root.left , t);
        }
        if (root.right != null){
            root.right = dfs(root.right , t);
        }
        if (root.val == t && root.left == null && root.right== null){
            return null;
        }
        return root;
    }
}