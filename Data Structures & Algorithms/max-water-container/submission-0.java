class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l =0;
        int r = height.length - 1;

        while (l<r){
            int h = Math.min(height[l] , height[r]);
            res = Math.max(h * (r-l) , res);
            while (l<r && height[l] <= h) l++;
            while (l<r && height[r] <= h) r--;
        }
        return res;
    }
}