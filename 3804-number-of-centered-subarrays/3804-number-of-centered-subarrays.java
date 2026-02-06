class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
    int count = 0;

    // Loop 1: The start of the subarray
    for (int i = 0; i < n; i++) {
        int currentSum = 0;
        
        // Loop 2: The end of the subarray
        for (int j = i; j < n; j++) {
            currentSum += nums[j]; // Keeping a running sum (easier than Prefix Sum array)
            
            // Loop 3: Is the currentSum equal to ANY element in nums[i...j]?
            for (int k = i; k <= j; k++) {
                if (nums[k] == currentSum) {
                    count++;
                    break; // Found it! No need to check other elements in this subarray
                }
            }
        }
    }
    return count;
    }
}