
class Solution {
    int maxLength(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int curr = 0;
        int target = 0;
        
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr == target){
                max = Math.max(max, i + 1);
            }
            
            if(hm.containsKey(curr - target)){
                max = Math.max(max, i - hm.get(curr));
            } 
            
            if(!hm.containsKey(curr)){
                hm.put(curr, i);
            }
        }
        
        return max;
    }
}