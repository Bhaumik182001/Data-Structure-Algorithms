class Solution {
    int high(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    int low(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = {0, 0};
        res[0] = low(nums, target);
        res[1] = high(nums, target);
        return res;
    }
}