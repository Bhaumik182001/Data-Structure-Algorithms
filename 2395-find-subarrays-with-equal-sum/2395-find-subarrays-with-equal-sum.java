class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 1; i < nums.length; i++){
            hs.add(nums[i] + nums[i-1]);
        }

       

        return hs.size() <= nums.length - 2;
    }
}