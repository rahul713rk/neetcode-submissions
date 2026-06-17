class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(nums, target, 0, 0, res , set);
        return res;
    }
    private void dfs(int[] nums , int target, int i, int sum, List<List<Integer>> res , List<Integer> set){
       if (i >= nums.length || target < sum){
        return;
       }
       if (target == sum){
        res.add(new ArrayList<>(set));
        return;
       }
       
       set.add(nums[i]);
       dfs(nums , target , i , sum+nums[i] , res , set);
       set.remove(set.size()-1);
       dfs(nums , target , i+1 , sum , res , set);
    }
}
