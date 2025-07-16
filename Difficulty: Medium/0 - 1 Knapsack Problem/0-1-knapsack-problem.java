class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] arr = new int[n+1][W+1];
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                if(wt[i - 1] > j){
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], val[i - 1] + arr[i- 1][j - wt[i - 1]]);
                }
            } 
        }
        
        return arr[n][W];
        
    }
}
