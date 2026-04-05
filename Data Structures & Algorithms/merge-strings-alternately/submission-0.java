class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        StringBuilder s = new StringBuilder();

        for (int i = 0 ; i < n || i < m ; i++){
            if (i<n){
                s.append(word1.charAt(i));
            }
            if (i<m){
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}