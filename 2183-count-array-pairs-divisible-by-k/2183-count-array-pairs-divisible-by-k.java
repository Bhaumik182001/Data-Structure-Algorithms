import java.util.*;

class Solution {
    public long countPairs(int[] nums, int k) {
        long count = 0;
        Map<Integer, Long> gcdFreq = new HashMap<>();

        // Step 1: Count frequencies of GCDs
        for (int num : nums) {
            int common = gcd(num, k);
            gcdFreq.put(common, gcdFreq.getOrDefault(common, 0L) + 1);
        }

        // Get unique GCDs to avoid nested loops over the whole array
        List<Integer> uniqueGcds = new ArrayList<>(gcdFreq.keySet());

        // Step 2: Compare pairs of unique GCDs
        for (int i = 0; i < uniqueGcds.size(); i++) {
            int g1 = uniqueGcds.get(i);
            long freq1 = gcdFreq.get(g1);

            // Case A: Pairing a GCD with itself (e.g., g1 * g1 % k == 0)
            if (((long)g1 * g1) % k == 0) {
                count += (freq1 * (freq1 - 1)) / 2;
            }

            // Case B: Pairing with a different GCD
            for (int j = i + 1; j < uniqueGcds.size(); j++) {
                int g2 = uniqueGcds.get(j);
                long freq2 = gcdFreq.get(g2);

                if (((long)g1 * g2) % k == 0) {
                    count += freq1 * freq2;
                }
            }
        }

        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}