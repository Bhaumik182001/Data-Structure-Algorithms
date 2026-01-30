class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()) return res;

        for(int i = 0; i < p.length(); i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }

        int n = p.length();
        int start = 0;
        int end = n;

        if(Arrays.equals(freq1, freq2)){
            res.add(start);
        }

        while(end < s.length()){
            freq1[s.charAt(start) - 'a']--;
            freq1[s.charAt(end) - 'a']++;

            start++;
            end++;

            if(Arrays.equals(freq1, freq2)){
                res.add(start);
            }   
        }

        return res;
    }
}