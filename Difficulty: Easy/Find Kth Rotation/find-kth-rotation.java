class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int ans = Integer.MAX_VALUE;
        int res = -1;
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[low] <= arr[mid]){
                if(ans > arr[low]){
                    ans = arr[low];
                    res = low;
                }
                low = mid + 1;
            } else {
                if(ans > arr[mid]){
                    ans = arr[mid];
                    res = mid;
                }
                high = mid - 1; 
            }
        }
        
        return res;
    }
}