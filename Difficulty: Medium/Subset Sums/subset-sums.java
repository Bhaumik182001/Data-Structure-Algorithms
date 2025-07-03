// User function Template for Java//User function Template for Java
class Solution {
    void fun(int[] arr, ArrayList<Integer> res, int index, int currSum){
        if(index == arr.length){
            res.add(currSum);
            return;
        }
        
        // Include. 
        fun(arr, res, index + 1, currSum + arr[index]);
        
        // Exclude.
        fun(arr, res, index + 1, currSum);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int index = 0;
        int currSum = 0;
        
        fun(arr, res, index, currSum);
        
        return res;
    }
}