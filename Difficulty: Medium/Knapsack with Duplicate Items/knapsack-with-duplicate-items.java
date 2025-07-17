// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int cap) {
        int m = val.length;
        int n = cap;
        
        int arr[][] = new int[m+1][n+1];
        
        for(int i = 1; i <=m; i++){
            for(int j = 1; j <=n; j++){
                if(wt[i - 1] > j){
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], val[i-1] + arr[i][j - wt[i- 1]]);
                }
            }
        }
        
        return arr[m][n];
        
    }
}