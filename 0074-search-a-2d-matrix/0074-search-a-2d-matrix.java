class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int len = nums[0].length;
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i][len - 1]){
                int low = 0;
                int high = len - 1;

                while(low <= high){
                    int mid = (low + high) / 2;

                    if(nums[i][mid] == target) return true;

                    if(target < nums[i][mid]){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }

        return false;
    }
}