/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int bSearch(MountainArray mountainArray, int target, int low, int high){
        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = mountainArray.get(mid);

            if(val == target) return mid;

            if(val < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    int bSearchReverse(MountainArray mountainArray, int target, int low, int high){
        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = mountainArray.get(mid);

            if(val == target) return mid;

            if(val < target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }    

    public int findInMountainArray(int target, MountainArray mountainArray) {
        int len = mountainArray.length();
        int low = 0;
        int high = len - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            int curr = mountainArray.get(mid);
            int next = mountainArray.get(mid + 1);

            if(curr > next){
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int peak = low;

        int a1 = bSearch(mountainArray, target, 0, peak);
        if(a1 != -1) return a1;

        return bSearchReverse(mountainArray, target, peak + 1, len - 1);
    }
}