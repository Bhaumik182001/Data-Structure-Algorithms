class Solution {
    public boolean wordPattern(String pattern, String j) {
        String s = pattern;
        String[] t = j.split(" ");

        if(s.length() != t.length) return false;

        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            String b = t[i];

            if(hm1.containsKey(a)){
                if(!hm1.get(a).equals(b)) return false;
            } else {
                hm1.put(a, b);
            }
        }

        for(int i = 0; i < t.length; i++){
            char a = s.charAt(i);
            String b = t[i];

            if(hm2.containsKey(b)){
                if(hm2.get(b) != a) return false;
            } else {
                hm2.put(b, a);
            }
        }

        return true;
    }
}