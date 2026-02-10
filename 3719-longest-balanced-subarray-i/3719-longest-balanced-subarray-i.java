class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            // Track distinct elements for the subarray starting at i
            Set<Integer> distinctEven = new HashSet<>();
            Set<Integer> distinctOdd = new HashSet<>();

            for (int j = i; j < n; j++) {
                int val = nums[j];
                
                // Add to the appropriate set
                if (val % 2 == 0) {
                    distinctEven.add(val);
                } else {
                    distinctOdd.add(val);
                }

                // Check if the current subarray [i...j] is balanced
                if (distinctEven.size() == distinctOdd.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}