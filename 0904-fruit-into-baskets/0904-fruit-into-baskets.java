class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        int left = 0;
       

        for(int right = 0; right < nums.length; right++){
            hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);
            while(hm.size() > 2){
                hm.put(nums[left], hm.get(nums[left]) -1);
                if(hm.get(nums[left]) == 0) hm.remove(nums[left]);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}