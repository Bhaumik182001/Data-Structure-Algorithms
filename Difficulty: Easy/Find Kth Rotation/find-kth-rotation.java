class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        int ansIndex = 0;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(nums[low] <= nums[mid]){
                if(ans > nums[low]){
                    ans = nums[low];
                    ansIndex = low;
                }
                low = mid + 1;
            } else {
                if(ans > nums[mid]){
                    ans = nums[mid];
                    ansIndex = mid;
                }
                high = mid - 1;
            }
        }
        
        return ansIndex;
    }
}