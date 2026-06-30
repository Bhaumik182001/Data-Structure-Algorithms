class Solution {
    public int findSubarray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum = 0;
        hm.put(0, 1);
        
        for(int num : nums){
            sum += num;
            
            if(hm.containsKey(sum)){
                count += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        
        return count;
    }
}
