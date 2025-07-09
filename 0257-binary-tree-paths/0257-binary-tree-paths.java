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
    String temp = "";

    void sol(TreeNode root, List<String> res, String temp){
        if(root == null) return;
        temp += root.val;
        if(root.left == null && root.right == null) res.add(temp);
        else temp += "->";

        sol(root.left, res, temp);
        sol(root.right, res, temp);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
 
        sol(root, res, temp);
        return res;
    }
}