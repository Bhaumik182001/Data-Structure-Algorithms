class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int i = 0;

        while(i < nums.length){
            int correctedIndex = nums[i] - 1;

            if(nums[i] != nums[correctedIndex]){
                int temp = nums[i];
                nums[i] = nums[correctedIndex];
                nums[correctedIndex] = temp;
            } else {
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                res.add(nums[i]);
            }
        }

        return res;
    }
}