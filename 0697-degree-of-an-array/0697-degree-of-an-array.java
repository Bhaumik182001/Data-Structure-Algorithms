class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxDegree = 0;

        // 1. Find the degree of the array
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            maxDegree = Math.max(maxDegree, freq.get(nums[i]));
        }

        int minLen = nums.length;

        // 2. Check every number that reached the maxDegree
        for (int num : freq.keySet()) {
            if (freq.get(num) == maxDegree) {
                
                // Find left and right bounds for THIS specific number
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

                // Update the global minimum length
                minLen = Math.min(minLen, right - left + 1);
            }
        }

        return minLen;
    }
}