class Solution {
    public int arrangeCoins(int n) {
        if(n < 2) return n;

        long low = 1;
        long high = (long)n;

        while(low <= high){
            long mid = (low + high) / 2;
            long coins = (mid * (mid + 1))/2;

            if(coins == (long)n) return (int)mid;

            if(coins > n){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int)high;
    }
}