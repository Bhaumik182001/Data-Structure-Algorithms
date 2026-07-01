class Solution {
    public int countKdivPairs(int[] arr, int k) { // Note: Changed return type to long to handle large counts
        long[] freq = new long[k]; // FIX: Use long array to avoid overflow during multiplication
        long count = 0;
        
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            freq[rem]++;
        }
        
        // Handle remainder 0
        count += (freq[0] * (freq[0] - 1)) / 2;
        
        // Handle all other remainders
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                count += (freq[i] * (freq[i] - 1)) / 2;
            } else {
                // FIX: Multiplied the groups together and changed 'k - 1' to 'k - i'
                count += freq[i] * freq[k - i];
            }
        }
        
        return (int)count;
    }
}