class Solution {
    boolean possible(int[] candies, long k, long pileSize){
        if(pileSize == 0) return true;

        long numberOfPiles = 0;

        for(int pile : candies){
            numberOfPiles += (pile / pileSize);

            if(numberOfPiles >= k) return true;
        }

        return numberOfPiles >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        long low = 1;
        long high = 0;

        for(int pile : candies){
            high = Math.max(high, pile);
        }

        long result = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if(possible(candies, k, mid)){
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int)result;
    }
}