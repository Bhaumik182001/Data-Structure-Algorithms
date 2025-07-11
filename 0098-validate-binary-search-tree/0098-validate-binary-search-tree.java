/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean balanced = true;

    long mini = Long.MIN_VALUE;
    long maxi = Long.MAX_VALUE;

    void check(TreeNode root, long min, long max){
        if(root == null) return;

        long value = (long)root.val;

        if(value <= min || value >= max) balanced = false;

        check(root.left, min, root.val);
        check(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        check(root, mini, maxi);
        return balanced;
    }
}