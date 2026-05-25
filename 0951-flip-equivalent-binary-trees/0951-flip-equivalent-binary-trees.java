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
    boolean checker(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        
        boolean flip = checker(root1.left, root2.right) && checker(root1.right, root2.left);
        boolean noflip = checker(root1.left, root2.left) && checker(root1.right, root2.right);

        return flip || noflip;
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return checker(root1, root2);
    }
}