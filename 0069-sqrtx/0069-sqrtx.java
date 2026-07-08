class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 1;

        while(low <= high){
            long mid = low +  (high - low) / 2;

            long sqr = mid * mid;

            if(sqr == x) return (int)mid;

            if(sqr < x) {
                low = (int)mid + 1;
                ans = (int)mid;
            } else high = (int)mid - 1;
        }

        return ans;
    }
}