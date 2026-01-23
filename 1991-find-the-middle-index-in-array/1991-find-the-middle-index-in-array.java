class Solution {
    public int findMiddleIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;

        for(int i : nums){
            rSum += i;
        }

        for(int i = 0; i < nums.length; i++){
            rSum -= nums[i];

            if(lSum == rSum) return i;

            lSum += nums[i];
        }

        
       
       return -1;
    }
}