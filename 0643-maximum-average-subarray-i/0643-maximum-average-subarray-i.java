class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        max = Math.max(max, sum);

        for(int right = k; right < nums.length; right++){
            sum = (nums[right] - nums[left++]) + sum;
            max = Math.max(max, sum);
        }

        return (double)max/k;
    }
}