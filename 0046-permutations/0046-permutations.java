class Solution {
    void recursion(int[] arr, int start, List<Integer> temp, ArrayList<List<Integer>> res){
        if(temp.size() == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(temp.contains(arr[i])) continue;
            temp.add(arr[i]);
            recursion(arr, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recursion(arr, 0, temp, res);
        return res;
    }
}