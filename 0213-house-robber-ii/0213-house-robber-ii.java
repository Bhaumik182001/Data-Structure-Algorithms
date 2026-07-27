class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int max1 = robber(nums, 0, nums.length - 2);
        int max2 = robber(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    int robber(int[] nums, int start, int end){
        int stepMinus2 = nums[start];
        int stepMinus1 = Math.max(nums[start], nums[start + 1]);

        for(int i = start + 2; i <= end; i++){
            int currentStep = Math.max(nums[i] + stepMinus2, stepMinus1);
            stepMinus2 = stepMinus1;
            stepMinus1 = currentStep;
        }

        return stepMinus1;
    }
}