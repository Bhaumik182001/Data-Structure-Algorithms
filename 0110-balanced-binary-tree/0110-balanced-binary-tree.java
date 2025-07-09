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
    int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    boolean balanced = true;

    void balance(TreeNode root){
        if(root == null) return;

        if(height(root.left) - height(root.right) > 1 || height(root.left) - height(root.right) < -1) balanced = false;

        balance(root.left);
        balance(root.right);
    }

    public boolean isBalanced(TreeNode root) {
        balance(root);
        return balanced;
    }
}