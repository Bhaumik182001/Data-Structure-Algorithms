class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        backtrack(0, nums, currentPath, res);

        return res;
    }

    private void backtrack(int start, int[] nums, List<Integer> currentPath, List<List<Integer>> res){
        res.add(new ArrayList<>(currentPath));

        for(int i = start; i < nums.length; i++){
            currentPath.add(nums[i]);
            backtrack(i + 1, nums, currentPath, res);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}