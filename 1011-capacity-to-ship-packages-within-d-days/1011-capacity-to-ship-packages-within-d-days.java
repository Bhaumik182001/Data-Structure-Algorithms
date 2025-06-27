class Solution {
    boolean possible(int[] arr, int n, int days, int cap){
        int sum = 0;
        int day = 1;

        for(int i = 0; i < n; i++){
            if((sum + arr[i]) <= cap) sum += arr[i];
            else {
                sum = arr[i];
                day++;
            }
        }

        if(day <= days) return true;
        return false;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
     
        for(int num: weights){
            low = Math.max(low, num);
            high += num;
        }

        int ans = 0;

        while(low <= high){ 
            int mid = (low + high)/2;
            if(possible(weights, weights.length, days, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}