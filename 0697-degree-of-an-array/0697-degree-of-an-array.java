class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            max = Math.max(max, hm.get(num));
        }

        int minLen = nums.length;

        for(int key : hm.keySet()){
            if(hm.get(key) == max){
                int left = 0;
                int right = nums.length - 1;

                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == key){
                        left = i;
                        break;
                    }
                }

                for(int i = nums.length - 1; i >= 0; i--){
                    if(nums[i] == key){
                        right = i;
                        break;
                    }
                }

                minLen = Math.min(minLen, right - left + 1);
            }
        }

        return minLen;
    }
}