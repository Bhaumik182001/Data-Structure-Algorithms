// User function Template for Java

class Solution {
    
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String text1, String text2) {
        
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
                    res[i][j] = Math.max(res[i][j - 1], res[i - 1][j]);
                }
            }
        }
        
        
        return text1.length() + text2.length() - res[m][n];
    }
}