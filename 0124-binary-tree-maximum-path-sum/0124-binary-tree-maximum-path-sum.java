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
    int res = 0;

    int dfs(TreeNode root){
        if(root == null) return 0;

        int l = dfs(root.left);
        int r = dfs(root.right);


        res = Math.max(res, root.val + l + r);
        res = Math.max(res, root.val + l);
        res = Math.max(res, root.val + r);
        res = Math.max(res, root.val);
        

        return root.val + Math.max(l, r);
    }

    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        res = root.val;
        dfs(root);
        return res;
    }
}