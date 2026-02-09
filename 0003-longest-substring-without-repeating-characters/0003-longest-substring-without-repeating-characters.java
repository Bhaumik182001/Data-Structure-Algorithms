class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int start=0, length =0;

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(map.containsKey(c)) if(map.get(c) >= start) start = map.get(c)+1;

            length = Math.max(length, i - start + 1);
            map.put(c, i);
        }

        return length;
    }
}