class Solution {
    boolean possible(int[] nums, int k, int limit){
        int count = 1;
        int total = 0;

        for(int num : nums){
            if(total + num > limit){
                count++;
                total = num;
            } else {
                total += num;
            }

            if(count > k) return false;
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        if(nums.length < k) return -1;

        int low = 0;
        int high = 0;

        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }

        int result = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(possible(nums, k, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}