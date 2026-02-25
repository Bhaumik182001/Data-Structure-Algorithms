class Solution {
    void fun(int[] arr, int start, List<Integer> temp, List<List<Integer>> res){
        res.add(new ArrayList<>(temp));

        for(int i = start; i < arr.length; i++){
            temp.add(arr[i]);
            fun(arr, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new  ArrayList<>();

        fun(nums, 0, temp, res);

        return res;
    }
}