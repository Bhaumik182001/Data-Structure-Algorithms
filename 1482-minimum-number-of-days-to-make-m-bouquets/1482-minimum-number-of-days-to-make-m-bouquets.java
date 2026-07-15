class Solution {
    // Helper function to check if we can form 'm' bouquets of 'k' adjacent flowers by day 'day'
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++; // This flower has bloomed by this day
                if (flowers == k) {
                    bouquets++;    // We formed a bouquet!
                    flowers = 0;   // Reset the consecutive flower count
                }
            } else {
                flowers = 0; // The chain of adjacent flowers is broken
            }
            
            // Optimization: optimization trick to stop early if we met the goal
            if (bouquets >= m) {
                return true;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        // Anti-Overflow Guard: cast to long before multiplication
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }

        // Find the search space range: minimum and maximum bloom days
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Binary search on the answer (the days range)
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                high = mid; // Try to find a smaller valid day
            } else {
                low = mid + 1; // Need more days for flowers to bloom
            }
        }

        return low;
    }
}