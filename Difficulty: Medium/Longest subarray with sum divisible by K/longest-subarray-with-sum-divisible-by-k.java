class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long sum = 0;
        int max = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            int rem = (int)(sum % k);
            
            if(rem < 0){
                rem += k;
            }
            
            if(rem == 0) max = Math.max(max, i + 1);
            
            if(hm.containsKey(rem)){
                max = Math.max(max, i - hm.get(rem));
            } else {
                hm.put(rem, i);
            }
        }
        
        return max;
    }
}
