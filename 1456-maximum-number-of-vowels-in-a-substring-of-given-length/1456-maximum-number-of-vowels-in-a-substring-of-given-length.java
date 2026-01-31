class Solution {
    boolean isVowel(char c){
        if("aeiou".contains(c + "")) return true;
        else return false;
    }

    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k - 1;
        int max = 0;

        int count = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++;   
            }
        }

        max = count;

        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i - k))){
                count--;
            }
            max = Math.max(max, count);

            if(max == k) return k;
        }

        return max;
    }
}