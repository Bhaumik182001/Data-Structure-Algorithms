class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }

    public long countPairs(int[] nums, int k) {
        long count = 0;
        HashMap<Integer, Long> freq = new HashMap<>();

        for(int num: nums){
            int common = gcd(num, k);
            freq.put(common, freq.getOrDefault(common, 0L) + 1);
        }

        List<Integer> unique = new ArrayList<>(freq.keySet());

        for(int i = 0; i < unique.size(); i++){
            int num1 = unique.get(i);
            long freq1 = freq.get(num1);

            if(((long)num1 * num1) % k == 0) count += ((freq1) * (freq1 - 1)) / 2;

            for(int j = i + 1; j < unique.size(); j++){
                int num2 = unique.get(j);
                long freq2 = freq.get(num2);

                if(((long)num2 * num1) % k == 0) count += (freq1 * freq2);
            }
        }

        return count;
    }
}