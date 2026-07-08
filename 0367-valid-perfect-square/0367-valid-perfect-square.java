class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int low = 1;
        int high = num;

        while(low <= high){
            long mid = low +(high - low) / 2;

            long sqr = mid * mid;

            if(sqr == num) return true;

            if(sqr < num) low = (int)mid + 1;
            else high = (int)mid - 1;
        }

        return false;
    }
}