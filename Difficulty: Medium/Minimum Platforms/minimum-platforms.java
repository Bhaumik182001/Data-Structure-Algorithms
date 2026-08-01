class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int maxCount = 0; // represents maximum no. of platformss required
        int count = 0; // count represents current number of platforms needed 
        
        int i = 0;
        int j = 0;
        
        while(i < arr.length && j < dep.length){
            if(arr[i] <= dep[j]){
                count++;
                maxCount = Math.max(maxCount, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        
        return maxCount;
        
    }
}
