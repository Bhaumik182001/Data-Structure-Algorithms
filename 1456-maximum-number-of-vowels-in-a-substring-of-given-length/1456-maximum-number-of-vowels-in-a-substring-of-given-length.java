class Solution {
    boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }

    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) count++;
        }

        max = Math.max(max, count);

        for(int right = k; right < s.length(); right++){
            if(isVowel(s.charAt(right))) count++;
            if(isVowel(s.charAt(left))) count--;

            max = Math.max(max, count);
            left++;
        }

        return max;
    }
}