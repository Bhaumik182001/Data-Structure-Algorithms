class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            hm1.put(a, hm1.getOrDefault(a, 0) + 1);
            hm2.put(b, hm2.getOrDefault(b, 0) + 1);
        }

        for(char c : hm1.keySet()){
            if(!hm1.get(c).equals(hm2.get(c))) return false;
        }

        return true;
    }
}