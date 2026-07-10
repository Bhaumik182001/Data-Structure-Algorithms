class Solution {
    boolean possible(int[] nums, long limit){
        long buffer = 0;

        for(int num : nums){
            if(num <= limit){
                buffer += (limit - num);
            } else {
                long excess = num - limit;
                buffer -= excess;
            }

            if(buffer < 0) return false;
        }

        return true;
    }

    public int minimizeArrayValue(int[] nums) {
        long low = 0;
        long high = 0;

        for(int num : nums){
            high = Math.max(high, num);
        }

        long result = high;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if(possible(nums, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int)result;
    }
}