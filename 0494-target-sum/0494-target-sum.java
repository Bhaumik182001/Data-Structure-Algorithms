class Solution {
    int knap(int[] nums, int target){
        int m = nums.length;
        
        int sum  = 0;

        for(int num: nums){
            sum += num;
        }

        if(target > sum || target < -sum || (target + sum) % 2 != 0){
            return 0;
        }

        int targetSum = (int)((target + sum)/2);
        int n = targetSum;

        int[][] arr = new int[m+1][n+1];

        for(int i = 0; i < m; i++){
            arr[i][0] = 1;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(nums[i - 1] > j){
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i-1][j - nums[i - 1]];
                }
            }
        }

        return arr[m][n];
    }

    public int findTargetSumWays(int[] nums, int target) {
        return knap(nums, target);
    }
}