class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxDegree = 0;

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            maxDegree = Math.max(maxDegree, freq.get(nums[i]));
        }

        int minLen = nums.length;
        for (int num : freq.keySet()) {
            if (freq.get(num) == maxDegree) {
                

                int left = 0;
                int right = nums.length - 1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == num) {
                        left = i;
                        break;
                    }
                }

                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == num) {
                        right = i;
                        break;
                    }
                }

        
                minLen = Math.min(minLen, right - left + 1);
            }
        }

        return minLen;
    }
}