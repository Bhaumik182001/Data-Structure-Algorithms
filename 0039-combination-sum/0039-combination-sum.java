class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        backtrack(0, candidates, target, currentPath, res);

        return res;
    }

    private void backtrack(int start, int[] candidates, int remaining, List<Integer> currentPath, List<List<Integer>> res){
        if(remaining == 0) {
            res.add(new ArrayList<>(currentPath));
            return;
        }

        if(remaining < 0){
            return;
        }

        for(int i = start; i < candidates.length; i++){
            

            currentPath.add(candidates[i]);
            backtrack(i, candidates, remaining - candidates[i], currentPath, res);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}