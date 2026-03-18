class Solution {
    public int minimumIndex(int[] nums, int itemSize) {
        int curr = Integer.MAX_VALUE;
        int ans = -1;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] >= itemSize){
                if(curr >= nums[i]) {
                    curr = nums[i];
                    ans = i;
                }
            }
        }

        return ans;
    }
}