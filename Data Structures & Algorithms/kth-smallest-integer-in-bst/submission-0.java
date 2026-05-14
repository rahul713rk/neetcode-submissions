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
    public int kthSmallest(TreeNode root, int k) {
        int[] res = new int[1];
        int[] kth = new int[]{k};
        dfs(root , kth , res);
        return res[0];
    }
    private void dfs(TreeNode root , int[] kth , int[] res){
        if (root == null) return ;
        dfs(root.left , kth, res);

        kth[0]--;
        if (kth[0]==0){
            res[0] = root.val;
            return;
        }


        dfs(root.right , kth, res);
        return;
    }
}
