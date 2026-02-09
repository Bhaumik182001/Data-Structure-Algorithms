class Solution {
    public int countSubarray(int[] nums) {
        // code here
        int count0 = 0;
        int count1 = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = 0;
        String key = "0";
        hm.put(key, 1);
        
        for(int num : nums){
            if(num == 0) count0++;
            if(num == 1) count1++;
            
            key = (count0 - count1) + "";
            
            if(hm.containsKey(key)){
                ans += hm.get(key);
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }
        
        return ans;
    }
}