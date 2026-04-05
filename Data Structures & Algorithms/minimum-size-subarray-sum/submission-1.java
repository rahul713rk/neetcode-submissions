class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        long sum = 0;
        int l = 0;
        int res = 100001;
        for (int r = 0; r<nums.length ; r++){
            sum += nums[r];
            while (sum - nums[l] >= target){
                sum -= nums[l];
                res = Math.min(res , (r-l+1));
                l++;
            }
            if (sum >= target){
                res = Math.min(res , (r-l+1));
            }
        }
        if (res == 100001) return 0;
        return res;
    }
}