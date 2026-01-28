class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int p = 0;

        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]);
            if(nums[i]!=nums[i+1]){
               nums[p++]=nums[i];
            } else{
                k--;
            } 
        }

       nums[p] = nums[nums.length-1];

        return k;
    }
}