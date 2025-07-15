class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            arr[i] = Math.max(arr[i-1], nums[i] + arr[i-2]);
        }

        int[] dp = new int[nums.length];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);

        for(int i = 3; i <  nums.length; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return Math.max(arr[arr.length - 2], dp[dp.length - 1]);
    }
}