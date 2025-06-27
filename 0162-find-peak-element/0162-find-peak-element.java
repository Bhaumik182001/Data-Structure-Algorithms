class Solution {
    public int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left < right){
            mid = (left + right)/2;

            if(arr[mid] > arr[mid + 1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}