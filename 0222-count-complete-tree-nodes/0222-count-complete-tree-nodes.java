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
    int preorder(TreeNode root){
        if(root == null) return 0;
        return 1 + preorder(root.left) + preorder(root.right);
    }

    public int countNodes(TreeNode root) {
        return preorder(root);
    }
}