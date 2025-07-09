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
    boolean exist = false;

    void pre(TreeNode root, int target, int sum){
        if(root == null) return;

        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == target) exist = true;
        }

        pre(root.left, target, sum);
        pre(root.right, target, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        pre(root, targetSum, 0);
        return exist;
    }
}