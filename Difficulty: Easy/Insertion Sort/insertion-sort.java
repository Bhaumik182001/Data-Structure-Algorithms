class Solution {
    // Please change the array in-place
    void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0){
                if(arr[j] < arr[j-1]) swap(arr, (j-1), j--);
                else break;
            }
            
        }
        
    }
}