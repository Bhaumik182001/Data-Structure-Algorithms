/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int bSearch(MountainArray mountainArr, int target, int low, int high){
        while(low <= high){
            int mid = (low + high) / 2;
            int val = mountainArr.get(mid);

            if(val == target) return mid;

            if(target < val){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    int bReverse(MountainArray mountainArr, int target, int low, int high){
        while(low <= high){
            int mid = (low + high) / 2;

            int val = mountainArr.get(mid);
            if(val == target) return mid;

            if(val < target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int low = 0;
        int high = len - 1;

        while(low < high){
            int mid = (low + high) / 2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int pivot = low;
        int a1 = bSearch(mountainArr, target, 0, low);
        int a2 = bReverse(mountainArr, target, low + 1, len - 1);

        if(a1 != -1) return a1;
        if(a2 != -1) return a2;

        return -1;
    }
}