class Solution {
    int com(String txt1, String txt2){
        int m = txt1.length();
        int n = txt2.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(txt1.charAt(i - 1) == txt2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String rev = sb.reverse().toString();

        int common = com(s, rev);

        return s.length() - common;
    }
}