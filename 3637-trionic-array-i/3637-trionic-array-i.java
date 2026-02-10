class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 1;
        int curr = nums[0];
        
        while(i < nums.length && curr < nums[i]){
            curr = nums[i];
            i++;
        }

        if(i == 1 || i == nums.length) return false;

        while(i < nums.length && curr > nums[i]){
            curr = nums[i];
            i++;
        }

        if(i == 0 || i == nums.length) return false;

        while(i < nums.length && curr < nums[i]){
            curr = nums[i];
            i++;
        }

        return i == nums.length;
    }
}