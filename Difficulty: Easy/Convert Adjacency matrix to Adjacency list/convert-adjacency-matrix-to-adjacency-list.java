class Solution {
    public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int[] arr : mat){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 1) list.add(i);
            }
            res.add(new ArrayList<>(list));
        }
        
        return res;
    }
}