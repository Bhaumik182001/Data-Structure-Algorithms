class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);

            hm.put(rightChar, hm.getOrDefault(rightChar, 0) + 1);

            while (hm.get(rightChar) > 1) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++; 
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}