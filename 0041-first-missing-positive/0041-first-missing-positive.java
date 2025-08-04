class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correctedIndex = nums[i] - 1;

            if((nums[i] < nums.length) && (nums[i] > 0) && (nums[i] != nums[correctedIndex])){
                int temp = nums[i];
                nums[i] = nums[correctedIndex];
                nums[correctedIndex] = temp;
            } else {
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}