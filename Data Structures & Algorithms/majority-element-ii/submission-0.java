class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer , Integer> counts = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : nums){
            counts.put(num , counts.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        int limit = (int)Math.floor(n/3);
        for(Map.Entry<Integer , Integer> entry : counts.entrySet()){
            if (entry.getValue() > limit){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}