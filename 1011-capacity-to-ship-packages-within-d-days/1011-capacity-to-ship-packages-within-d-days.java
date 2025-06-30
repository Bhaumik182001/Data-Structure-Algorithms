class Solution {
    boolean possible(int[] arr, int days, int capacity){
        int sum = 0;
        int day = 1;

        for(int i = 0; i < arr.length; i++){
            if((sum + arr[i]) <= capacity){
                sum += arr[i];
            } else {
                sum = arr[i];
                day++;
            }
        }

        return day <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        int ans = 0;

        for(int weight: weights){
            high += weight;
            low = Math.max(low, weight);
        }

        while(low <= high){
            int mid = (low + high) / 2;

            if(possible(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       return ans;
    }
}