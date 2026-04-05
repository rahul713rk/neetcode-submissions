class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int p = k%n;
        int[] temp1 = new int[p];
        int[] temp2 = new int[n-p];
        for (int i = 0 ; i<n-p ; i++){
            temp2[i] = nums[i];
        }
        int c =0;
        for (int i=n-p ; i<n ; i++){
            temp1[c] = nums[i];
            c++;
        }
        c=0;
        for (int i =0 ; i<n ; i++){
            if (i<p){
                nums[i] = temp1[i];
            }else{
                nums[i] = temp2[c];
                c++;
            }
        }
        return;
    }
}