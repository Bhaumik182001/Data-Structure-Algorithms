// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sum = 0;
        int max = 0;
      

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(sum == target){
                max = Math.max(max, i + 1);
            }

            if(hm.containsKey(sum - target)){
                max = Math.max(max, i - hm.get(sum - target));
            }

            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        return max;
    }
}
