class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(nums , 0 , res , set);
        return res;
    }

    private void dfs(int[] nums , int i , List<List<Integer>> res , List<Integer> set){
        if (i >= nums.length){
            res.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        dfs(nums , i+1 , res , set);
        set.remove(set.size()-1);
        dfs(nums, i+1 , res , set);
    }
    
}
