class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int left = 0;
        int right = 0;
        
        for(int num: arr){
            right += num;
        }
        
        for(int i = 0; i < arr.length; i++){
            right -= arr[i];
            if(left == right) return i;
            left += arr[i];
            
        }
        
        return -1;
    }
}
