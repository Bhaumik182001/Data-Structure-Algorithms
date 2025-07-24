class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];

        HashMap<Integer, Integer> ht = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int find = target - nums[i];

            if(!ht.containsKey(find)){
                ht.put(nums[i], i);
            } else {
                res[0] = ht.get(find);
                res[1] = i;
            }
        }

        return res;
    }
}