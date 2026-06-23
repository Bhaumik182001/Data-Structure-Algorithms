class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int k = nums.length;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[index++] = nums[i];
            } else {
                k--;
            }
        }

        nums[index] = nums[nums.length - 1];

        return k;
    }
}