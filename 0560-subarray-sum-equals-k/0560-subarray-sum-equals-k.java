class Solution {
    public int subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0,1);
        int count = 0;

        for(int num : nums){
            sum += num;

            if(hm.containsKey(sum - target)){
                count += hm.get(sum - target);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}