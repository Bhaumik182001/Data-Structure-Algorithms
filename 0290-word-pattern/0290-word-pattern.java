class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;
       
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();


        for(int i = 0; i < pattern.length(); i++){
            char a = pattern.charAt(i);
            String b = str[i];
            if(hm1.containsKey(a)){
                if(!hm1.get(a).equals(b))return false;
            } else hm1.put(a, b);
        }

         for(int i = 0; i < pattern.length(); i++){
            char a = pattern.charAt(i);
            String b = str[i];
            if(hm2.containsKey(b)){
                if(hm2.get(b) != a)return false;
            } else hm2.put(b, a);
        }

        return true;
    }
}