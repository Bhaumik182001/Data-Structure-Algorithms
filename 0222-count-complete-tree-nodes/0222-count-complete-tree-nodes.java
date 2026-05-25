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


    int pre(TreeNode root){
        if(root == null) return 0;
        return 1 + pre(root.left) + pre(root.right);     
    }

    public int countNodes(TreeNode root) {
        return pre(root);

    }
}