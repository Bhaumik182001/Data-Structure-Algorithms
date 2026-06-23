class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int prev = nums[0];
        int occ = 0;

        for(int i = 0; i < nums.length; i++){
            if(prev == nums[i]){
                occ++;
            } else {
                occ = 1;
                prev = nums[i];
            }

            if(occ < 3){
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}