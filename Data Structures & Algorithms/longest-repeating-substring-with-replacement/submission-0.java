class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r =0;
        int n = s.length();
        int res = 0;
        int maxfreq = 0;
        Map<Character , Integer> freq = new HashMap<>();

        while(r<n){
            char c = s.charAt(r);
            int temp = freq.getOrDefault(c,0)+1;
            freq.put(c ,temp);
            maxfreq = Math.max(maxfreq , temp);

            if (r-l+1-maxfreq > k){
                freq.put(s.charAt(l) , freq.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res , r-l+1);
            r++;
        }
        return res;
    }
}
