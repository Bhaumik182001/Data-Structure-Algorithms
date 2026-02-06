class Solution {
    public static int firstRepeated(int[] nums) {
        // code here
        int ans = -1;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
         for(int i = 0; i < nums.length; i++){
             if(hm.get(nums[i]) > 1) return i + 1;
        }
        
        return ans;
    }
}
