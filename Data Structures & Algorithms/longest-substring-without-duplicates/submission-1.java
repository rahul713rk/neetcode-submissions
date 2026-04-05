class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r= 0;
        int res = 0;
        int n = s.length();
        Set<Character> count= new HashSet<>();
        while(r<n){
            char c = s.charAt(r);
            if (!count.contains(c)){
                count.add(c);
                r++;
            }else{
                // res = Math.max(res , count.size());
                while(s.charAt(l) != s.charAt(r)){
                    count.remove(s.charAt(l));
                    l++;
                }
                l++;
                r++;
            }
            res = Math.max(res , count.size());
        }
        return res;
    }
}
