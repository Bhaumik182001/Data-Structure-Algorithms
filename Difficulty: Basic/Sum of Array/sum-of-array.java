// User function Template for Java

class Solution {
   
    int sum(int[] arr, int n){
        if(n == -1) return 0;
        return arr[n] + sum(arr, n - 1); 
    }
    
    int arraySum(int arr[]) {
        return sum(arr, arr.length - 1);
    }
}
