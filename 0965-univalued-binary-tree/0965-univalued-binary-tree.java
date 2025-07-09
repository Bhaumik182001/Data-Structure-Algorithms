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
    boolean uni = true;
    

    void check(TreeNode root, int check){
        if(root == null) return;
        if(root.val != check) uni = false;
        check(root.left, check);
        check(root.right, check);
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
      
        check(root, root.val);
        return uni;
    }
}