class Solution {
    void segregate0and1(int[] arr) {
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            } 
        }
    }
}
