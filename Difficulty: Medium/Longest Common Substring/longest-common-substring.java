// User function Template for Java

class Solution {
    int sub(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        
        int[][] res = new int[m+1][n+1];
        
        int max = 0;
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    res[i][j] = 1 + res[i - 1][j - 1];
                    max = Math.max(max, 1 + res[i - 1][j - 1]);
                } else {
                    res[i][j] = 0;
                }
            }
        }
        
        return max;
    }
    
    public int longestCommonSubstr(String s1, String s2) {
        return sub(s1, s2);
        
    }
}