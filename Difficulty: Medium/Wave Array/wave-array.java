class Solution {
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public void sortInWave(int arr[]) {
        for(int i = 0; i < arr.length - 1; i+=2){
            swap(arr, i, i + 1);
        }
        
    }
}
