class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        int ans = -1;

        while(low < high){
            int mid = (low + high) / 2;

            if(nums[mid] > nums[mid + 1]){
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}