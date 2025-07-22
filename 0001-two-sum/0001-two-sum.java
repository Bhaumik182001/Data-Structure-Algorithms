class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hs = new HashMap<>();
        int[] res = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            int b = target - nums[i];
            if(hs.containsKey(b)){
                res[0] = hs.get(b);
                res[1] = i;
            } else {
                hs.put(nums[i], i);
            }
        }

        return res;
    }
}