class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<String, Integer> hm = new HashMap<>();
        int max = 0;
        int count0 = 0;
        int count1 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 1) count1++;

            int diff = count0 - count1;

            if(diff == 0) max = Math.max(max, i + 1);

            String key = diff + "";

            if(hm.containsKey(key)){
                max = Math.max(max, i - hm.get(key));
            } else {
                hm.put(key, i);
            }     
        }

        return max;
    }
}