class Solution {
    public int bLow(int[] nums, int target){
        int res = -1;
        
        int l = 0;
        int h = nums.length - 1;
        int mid = 0;

        while(l <= h){
            mid = (l+h)/2;
            if(nums[mid] == target){
                res = mid;
                h = mid - 1;
            }
            else if(nums[mid] < target){
                
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        
        return res;
    }

    public int bHigh(int[] nums, int target){
        int res = -1;
        
        int l = 0;
        int h = nums.length - 1;
        int mid = 0;

        while(l <= h){
            mid = (l+h)/2;

            if(nums[mid] == target){
                res = mid;
                l = mid + 1;
            }
            else if(nums[mid] > target){
                
                h = mid - 1;
            } else {
              
                l = mid + 1;
            }
        }

        
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
       
        
        int[] res = new int[2];
    
        res[0] = bLow(nums, target);
        res[1] = bHigh(nums, target);

        return res;
    }
}