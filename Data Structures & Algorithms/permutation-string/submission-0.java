class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        Map<Character, Integer> dic_1 = new HashMap<>();
        Map<Character, Integer> dic_2 = new HashMap<>();

        // Initialize frequency maps for the first window
        for (int i = 0; i < s1.length(); i++) {
            dic_1.put(s1.charAt(i), dic_1.getOrDefault(s1.charAt(i), 0) + 1);
            dic_2.put(s2.charAt(i), dic_2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int matches = 0;
        for (char c : dic_1.keySet()) {
            if (dic_1.get(c).equals(dic_2.getOrDefault(c, 0))) {
                matches++;
            }
        }

        int l = 0;

        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == dic_1.size()) {
                return true;
            }

            // Add the new rightmost character
            char temp_r = s2.charAt(r);
            dic_2.put(temp_r, dic_2.getOrDefault(temp_r, 0) + 1);
            if (dic_1.containsKey(temp_r)) {
                if (dic_2.get(temp_r).equals(dic_1.get(temp_r))) {
                    matches++;
                } else if (dic_2.get(temp_r) - 1 == dic_1.get(temp_r)) {
                    matches--;
                }
            }

            // Remove the leftmost character
            char temp_l = s2.charAt(l);
            if (dic_1.containsKey(temp_l)) {
                if (dic_2.get(temp_l).equals(dic_1.get(temp_l))) {
                    matches--;
                }
            }
            if (dic_2.get(temp_l) == 1) {
                dic_2.remove(temp_l);
            } else {
                dic_2.put(temp_l, dic_2.get(temp_l) - 1);
            }
            if (dic_1.containsKey(temp_l) && dic_2.getOrDefault(temp_l, 0).equals(dic_1.get(temp_l))) {
                matches++;
            }

            l++;
        }

        // Check the last window
        return matches == dic_1.size();
    }
}
