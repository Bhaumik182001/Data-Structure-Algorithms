class Solution {
    boolean sum(int[] nums, int target) {
        // code here
        int m = nums.length;
        int n = target;
        
        boolean[][] arr = new boolean[m+1][n+1];
        
        for(int i = 0; i <= m; i++){
            arr[i][0] = true;
        }
        
        for(int i = 1; i <= m; i++){
            for(int sum = 0; sum <= n; sum++){
                if(nums[i - 1] > sum){
                    arr[i][sum] = arr[i-1][sum];
                } else {
                    arr[i][sum] = arr[i-1][sum] || arr[i-1][sum - nums[i-1]];
                }
            }
        }
        
        return arr[m][n];
    }

    public boolean canPartition(int[] nums) {

        int res = 0;

        for(int num: nums){
            res += num;
        }

        System.out.println(res);

        if(res % 2 != 0) return false;

        res /= 2;

        return sum(nums, res);
    }
}