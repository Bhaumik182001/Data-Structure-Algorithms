class Solution {
    boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }

    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                if(isVowel(s.charAt(i))) v++;
                else c++;
            }
            
        }

        if(c == 0) return 0;

        return v/c;
    }
}