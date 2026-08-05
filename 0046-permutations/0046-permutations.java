class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, currentPath, res);

        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> currentPath, List<List<Integer>> result){
        if(currentPath.size() == nums.length){
            result.add(new ArrayList<>(currentPath));
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i] == true) continue;

            used[i] = true;
            currentPath.add(nums[i]);

            backtrack(nums, used, currentPath, result);

            used[i] = false;
            currentPath.remove(currentPath.size() - 1);
        }
    }
}