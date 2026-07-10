class Solution {
    long slopeSum(long peak, long count){
        if(count == 0) return 0;

        if(count >= peak - 1){
            long arithemeticSum = (peak * (peak - 1)) / 2;
            long leftOver = count - (peak - 1);
            return arithemeticSum + leftOver;
        } else {
            long smallestValueInSlope = peak - 1 - count;
            long fullPyramid = (peak * (peak - 1)) / 2;
            long cuttOffPyramid = (smallestValueInSlope * (smallestValueInSlope + 1)) / 2;

            return fullPyramid - cuttOffPyramid;
        }
    }

    boolean possible(int n, int index, int maxSum, long peak){
        long leftElements = index;
        long rightElements = n - index - 1;

        long sum = peak + slopeSum(peak, leftElements) + slopeSum(peak, rightElements);
        
        return sum <= maxSum;
    }

    public int maxValue(int n, int index, int maxSum) {
        long low = 1;
        long high = maxSum;
        long result = 1;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if(possible(n, index, maxSum, mid)){
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int)result;
    }
}