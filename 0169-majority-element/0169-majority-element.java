class Solution {
    public int majorityElement(int[] nums) {
        int a = 0;
        int lead = 0;
        for(int i = 0; i < nums.length; i++){
            if(lead == 0) a = nums[i];
            if(nums[i] == a) lead++;
            else lead--;    
        }

        return a;
      
    }
}