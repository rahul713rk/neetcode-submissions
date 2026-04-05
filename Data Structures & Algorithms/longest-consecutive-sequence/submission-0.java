class Solution {
    // static{
    //     Solution sol= new Solution();
    //     for (int i =0 ; i<200 ; i++){
    //         sol.longestConsecutive(new int[]{1});
    //     }
    // }
    public int longestConsecutive(int[] nums) {
        int res = 0;
        
        HashSet<Integer> nums_set = new HashSet<>(); 
        for (int i : nums){
            nums_set.add(i);
        }

        for (int num : nums_set){
            if (!nums_set.contains(num-1)){
                int count = 1;
                
                while(nums_set.contains(num+count)){
                    count++;
                }

                res = Math.max(res , count);
            }
        }
        return res;
    }
}