class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);

            while(hm.get(nums[right]) > k){
                hm.put(nums[right], hm.get(nums[right]) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}