class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            hs.add(s.charAt(i));

            if(hs.size() == (i + 1) % 3) count++;
        }
        
        return count;
    }
}