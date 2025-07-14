// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return Math.max(arr[0], arr[1]);
        arr[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i++){
            arr[i] = Math.max(arr[i-1], arr[i] + arr[i-2]);
        }
        
        return arr[arr.length - 1];
    }
}