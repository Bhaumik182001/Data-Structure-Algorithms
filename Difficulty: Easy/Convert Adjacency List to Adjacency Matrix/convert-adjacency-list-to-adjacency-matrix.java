class Solution {
    public int[][] adjToMat(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int len = adj.size();
        int[][] res = new int[len][len];
        
        int index = 0;
        
        for(ArrayList<Integer> list : adj){
            for(int num : list){
                res[index][num] = 1;
            }
            index++;
        }
        
        return res;
    }
}
