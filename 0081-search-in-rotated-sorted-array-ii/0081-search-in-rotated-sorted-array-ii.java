class Solution {
    public boolean search(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;

        while(left <= right){
            mid = (left + right)/2;

            if(nums[mid] == k) return true;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            } else if(nums[left] <= nums[mid]){
                if(nums[left] <= k && nums[mid] >= k){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] <= k && nums[right] >= k){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }


        return false;
    }
}