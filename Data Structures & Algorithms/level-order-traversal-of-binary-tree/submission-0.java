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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            int n = q.size();
            for (int i = 0 ; i<n ; i++){
                TreeNode temp = q.poll();
                if (temp != null){
                    curr.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
            if (curr.size() > 0){
                res.add(curr);
            }
        }
        return res;
    }
}
