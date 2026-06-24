class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int len) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];

            if(hm.containsKey(val) && i - hm.get(val) <= len) return true;

            hm.put(val, i);
        }

        return false;
    }
}