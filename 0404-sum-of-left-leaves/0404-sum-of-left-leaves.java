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
    int sum(TreeNode root){
        if(root == null) return 0;
        int leftSum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) leftSum = root.left.val;
        return leftSum + sum(root.left) + sum(root.right);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }
}