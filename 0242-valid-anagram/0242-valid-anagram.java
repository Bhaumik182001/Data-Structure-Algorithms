class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       
       HashMap <Character, Integer> hs = new HashMap<>();
    
        for(int i = 0; i < s.length(); i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), 1);
            } else {
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(!hs.containsKey(t.charAt(i)) || hs.get(t.charAt(i)) == 0){
                return false;
            } else {
                hs.put(t.charAt(i), hs.get(t.charAt(i)) - 1);
            }
        }

        for(Character c: hs.keySet()){
            if(hs.get(c) != 0) return false;
        }
       

        return true;
    }
}