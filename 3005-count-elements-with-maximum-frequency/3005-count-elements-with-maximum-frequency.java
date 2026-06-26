class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int max = 0;

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            max = Math.max(max, hm.get(num));
        }

        for(int key : hm.keySet()){
            if(hm.get(key) == max) ans += hm.get(key);
        }

        return ans;
    }
}