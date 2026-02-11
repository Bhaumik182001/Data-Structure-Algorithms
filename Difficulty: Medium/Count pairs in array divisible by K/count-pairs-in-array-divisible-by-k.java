class Solution {
    public static long countKdivPairs(int nums[], int n, int k) {
        long count = 0;
        long[] freq = new long[k];

        // Step 1: Count frequencies of remainders
        for (int num : nums) {
            int rem = ((num % k) + k) % k; // Handles negative numbers too
            freq[rem]++;
        }

        // Step 2: Handle remainder 0 (must pair with another 0)
        // Formula: n * (n - 1) / 2
        count += (freq[0] * (freq[0] - 1)) / 2;

        // Step 3: Handle pairs of remainders (i) and (k - i)
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                // Special case: middle element (e.g., k=4, rem=2)
                count += (freq[i] * (freq[i] - 1)) / 2;
            } else {
                // General case: pairs of rem i and rem k-i
                count += (freq[i] * freq[k - i]);
            }
        }

        return count;
    }
}