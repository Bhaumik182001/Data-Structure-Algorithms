class Solution {
    public String reverseVowels(String s) {
        char[] ca = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "AEIOUaeiou";
        

        while(start < end){

            while(start < end && vowels.indexOf(ca[start]) == -1){
                start++;
            } 

            while(start < end && vowels.indexOf(ca[end]) == -1){
                end--;
            }

            char temp = ca[start];
            ca[start] = ca[end];
            ca[end] = temp;

            start++;
            end--;
        }

        String ans = new String(ca);
        return ans;
    }
}