class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if(s.length() < p.length()) return res;

        for(int i = 0; i < p.length(); i++){
            freq2[p.charAt(i) - 'a']++;
            freq1[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2)) res.add(0);

        for(int right = p.length(); right < s.length(); right++){
            freq1[s.charAt(left) - 'a']--;
            freq1[s.charAt(right) - 'a']++;
            left++;

            if(Arrays.equals(freq1, freq2)) res.add(left);
            
        }



        return res;
    }
}