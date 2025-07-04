class Solution {
    void recursion(int[] arr, int start, List<Integer> temp, ArrayList<List<Integer>> res){
        res.add(new ArrayList<>(temp));

        for(int i = start; i < arr.length; i++){
            if(start < i && arr[i] == arr[i-1]) continue;
            temp.add(arr[i]);
            recursion(arr, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        recursion(arr, 0, temp, res);
        return res;
    }
}