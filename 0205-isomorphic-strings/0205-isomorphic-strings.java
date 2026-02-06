class Solution {

    HashMap<Character, Character> h1 = new HashMap<Character, Character>();
    HashMap<Character, Character> h2 = new HashMap<Character, Character>();

    public  boolean isIsomorphic(String s, String t) {
        
        for(int i=0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))) if(h1.get(s.charAt(i))!=t.charAt(i)) return false;
            if(h2.containsKey(t.charAt(i))) if(h2.get(t.charAt(i))!=s.charAt(i)) return false;
            
            h1.put(s.charAt(i), t.charAt(i));
            h2.put(t.charAt(i), s.charAt(i)); 
        }
        return true;
    }
}