
class Solution {
    int maxLength(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int curr = 0;
        
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr == 0){
                max = Math.max(max, i + 1);
            }
            
            if(hm.containsKey(curr)){
                max = Math.max(max, i - hm.get(curr));
            } else {
                hm.put(curr, i);
            }
        }
        
        return max;
    }
}