class Solution {
    public int findSubarray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        
        int ans = 0;
        int curr = 0;
        
        for(int num: nums){
            curr += num;
            if(hm.containsKey(curr)){
                ans += hm.get(curr);
                hm.put(curr, hm.get(curr) + 1);
            } else {
                hm.put(curr, 1);
            }
        }
        
        return ans;
    }
}
