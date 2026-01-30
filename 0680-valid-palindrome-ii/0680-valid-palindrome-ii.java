class Solution {
    boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;  
        }
        
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int issues = 0;
        boolean a = false;
        boolean b = false;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                issues++;
                if( issues > 2) return false;

                if(s.charAt(i + 1) == s.charAt(j)) a = isPalindrome(s, i + 1, j);
                if(s.charAt(i) == s.charAt(j - 1)) b = isPalindrome(s, i, j - 1);

                return a || b;
            }
        }

        return true;
    }
}