class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int max = 0;
        int target = k;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == target){
                max = Math.max(max, i + 1);
            }
            
            if(hm.containsKey(sum - target)){
                max = Math.max(max, i - hm.get(sum - target));
            }
            
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }
        
        return max;
    }
}
