class Solution {
    boolean palindrome(String s, int i, int j){
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            
            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int issues = 0;
        boolean a = false;
        boolean b = false;

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                issues++;
                if(issues > 2) return false;

                if(s.charAt(left + 1) == s.charAt(right)) a = palindrome(s, left + 1, right);
                if(s.charAt(left) == s.charAt(right - 1)) b = palindrome(s, left, right - 1);

                return a || b;
            }
        }

        return true;
    }
}