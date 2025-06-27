class Solution {
    boolean possible(int mid, int[] piles, int h){
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += (long)(piles[i] + mid - 1) / mid;
        }
        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = 0;

        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(mid, piles, h)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}