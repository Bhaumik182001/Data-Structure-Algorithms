class Solution {
    int knap(int[] coins, int amount){
        int m = coins.length;
        int n = amount;
        int[][] arr = new int[m+1][n+1];

        for(int j = 0; j <= n; j++){
            arr[0][j] = Integer.MAX_VALUE - 1;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(coins[i - 1] > j){
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j], 1 + arr[i][j - coins[i -1]]);
                }
            }
        }

         return arr[m][n] == Integer.MAX_VALUE - 1? -1 : arr[m][n];
    }

    public int coinChange(int[] coins, int amount) {
        return knap(coins, amount);
    }
}