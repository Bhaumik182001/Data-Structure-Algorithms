class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int m = nums.length;
        int n = target;
        
        int[][] arr = new int[m+1][n+1];
        
        for(int i = 0; i <= m; i++){
            arr[i][0] = 1;
        }
        
        for(int i = 1; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(nums[i - 1] > j){
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j - nums[i-1]];
                }
            }
        }
        
        return arr[m][n];
    }
}