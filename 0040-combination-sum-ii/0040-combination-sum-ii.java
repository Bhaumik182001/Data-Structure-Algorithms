class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(0, candidates, target, currentPath, res);

        return res;
    }

    private void backtrack(int start, int[] candidates, int remaining, List<Integer> currentPath, List<List<Integer>> res){
        if(remaining == 0) {
            res.add(new ArrayList<>(currentPath));
            return;
        }

        if(remaining < 0) return;

        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i - 1]) continue;

            currentPath.add(candidates[i]);
            backtrack(i + 1, candidates, remaining - candidates[i], currentPath, res);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}