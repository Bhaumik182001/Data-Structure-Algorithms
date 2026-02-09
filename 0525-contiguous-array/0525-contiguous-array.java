class Solution {
    public int findMaxLength(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        int max = 0;
        String key = "0";
        hm.put(key, 1);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 1) count1++;
            
            key = (count0 - count1) + "";

            if(count0 - count1 == 0){
                max = Math.max(max, i + 1);
            }
            
            if(hm.containsKey(key)){
                max = Math.max(max, i - hm.get(key));
            } else {
                hm.put(key, i);
            }
        }
        
        return max;
    }
}