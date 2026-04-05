class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int res = 0;
        int r = l+1;

        while(r<prices.length){
            if (prices[l] > prices[r]){
                l=r;
                r++;
            }else{
                res = Math.max(res , prices[r]-prices[l]);
                r++;
            }
        }
        return res;
    }
}