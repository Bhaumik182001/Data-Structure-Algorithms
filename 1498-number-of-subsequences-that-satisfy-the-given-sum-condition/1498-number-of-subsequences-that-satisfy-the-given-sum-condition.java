class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1000000007;
        int n = nums.length;

        int[] power = new int[n];
        power[0] = 1;

        for(int i = 1; i < n; i++){
            power[i] = (power[i - 1] * 2) % mod;
        }

        int left = 0;
        int right = n - 1;
        int result = 0;

        while(left <= right){
            int sum = nums[left] + nums[right];

            if(sum <= target){
                result = (result + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}