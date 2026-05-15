class Solution {
    int res  = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums , new ArrayList<>() , 0);
        return res;
    }

    private void backtrack(int[] nums , List<Integer> sets , int i){
        int xorr = 0;
        for (int num : sets){
            xorr = xorr ^ num;
        }
        res += xorr;
        for (int j= i ; j< nums.length ; j++){
            sets.add(nums[j]);
            backtrack(nums , sets , j+1);
            sets.remove(sets.size()-1);
        }
    }
}