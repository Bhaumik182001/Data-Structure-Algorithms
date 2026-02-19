class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1); // Base case
        return backtrack(root, 0L, targetSum, map);
    }

    private int backtrack(TreeNode node, long currentSum, int target, Map<Long, Integer> map) {
        if (node == null) return 0;

        currentSum += node.val;
        
        // 1. See if a valid sub-path ends here
        int count = map.getOrDefault(currentSum - target, 0);

        // 2. Add current sum to map (Fix: default should be 0)
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        // 3. Explore children
        count += backtrack(node.left, currentSum, target, map);
        count += backtrack(node.right, currentSum, target, map);

        // 4. Backtrack: Remove current sum so it doesn't affect other branches
        map.put(currentSum, map.get(currentSum) - 1);

        return count;
    }
}