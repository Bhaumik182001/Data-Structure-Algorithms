class Solution {
    public int countSubarray(int[] nums) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int count = 0;
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("0", 1);
        
        for(int num : nums){
            if(num == 0) count0++;
            if(num == 1) count1++;
            
            int diff = count0 - count1;
            String key = diff + "";
            
            if(hm.containsKey(key)){
                count += hm.get(key);
            }
            
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        
        return count;
        
    }
}