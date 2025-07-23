class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;

        for(int i = 0;  i < s.length(); i++){
            if(s.charAt(i) == '(') open++;
            else close++;

            if(open == close) ans = Math.max(ans, 2 * open);
            else if(open < close){
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        for(int j = s.length() - 1; j > -1; j--){
            if(s.charAt(j) == '(') open++;
            else close++;

            if(open == close) ans = Math.max(ans, 2 * open);
            else if(open > close){
                open = 0;
                close = 0;
            }
        }

        return ans;
    }
}