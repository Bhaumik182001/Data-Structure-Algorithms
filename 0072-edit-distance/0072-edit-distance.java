class Solution {
    int sub(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        
        int[][] res = new int[m+1][n+1];
        
        for(int i = 0; i <= m; i++){
            res[i][0] = i;
        }

        for(int j = 0; j <= n; j++){
            res[0][j] = j;
        }
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    res[i][j] = res[i - 1][j - 1];
                } else {
                    res[i][j] = 1 + Math.min(res[i-1][j-1] , Math.min(res[i][j-1], res[i-1][j]));
                }
            }
        }
        
        return res[m][n];
    }

    public int minDistance(String word1, String word2) {
        return sub(word1, word2);
    }
}