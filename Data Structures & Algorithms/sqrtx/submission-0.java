class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = 0;

        while (l<=r){
            int m = l +(r-l)/2;
            long temp = (long)m*m;
            if (temp > x){
                r = m-1;
            }else if (temp < x){
                res = m;
                l = m+1;
            }
            else{
                res = m;
                break;
            }
        }
        return res;
    }
}