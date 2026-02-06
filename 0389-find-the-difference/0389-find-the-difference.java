class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            freq1.put(s.charAt(i), freq1.getOrDefault(s.charAt(i), 1) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            if(!freq1.containsKey(t.charAt(i))) return t.charAt(i);
            else freq2.put(t.charAt(i), freq2.getOrDefault(t.charAt(i), 1) + 1);
        }

        for(char c : freq2.keySet()){
            if(!freq2.get(c).equals(freq1.get(c))) return c;
        }

        return 'c';
    }
}