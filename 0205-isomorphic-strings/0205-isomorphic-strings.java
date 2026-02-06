class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(hm1.containsKey(a)){
                if(hm1.get(a) != b)return false;
            } else hm1.put(a, b);

            if(hm2.containsKey(b)){
                if(hm2.get(b) != a)return false;
            } else hm2.put(b, a);
        }

        return true;
    }
}