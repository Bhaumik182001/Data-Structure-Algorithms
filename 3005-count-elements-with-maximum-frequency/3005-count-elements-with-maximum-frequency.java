class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, hm.get(nums[i]));
        }

        int count = 0;
        
        for(int num: hm.keySet()){
            if(hm.get(num) == max) count += max;
        }
        
        return count;
    }
}