class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int index = 0;
        int num = nums[0];
     
        while(index < nums.length){
            if(num == nums[index]){
                index++;
            } else{
                res.add(num);
            }
            num++;
        }

        return res;
    }
}