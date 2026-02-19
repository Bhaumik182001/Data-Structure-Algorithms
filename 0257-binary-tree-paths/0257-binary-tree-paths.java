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
    void recur(TreeNode root, List<String> res, String temp){
        if(root == null) return;

        temp += root.val;

        if(root.left == null && root.right == null){
            res.add(temp);
            return;
        }

        temp += "->";

        recur(root.left, res, temp);
        recur(root.right, res, temp);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        recur(root, res, "");
        return res;
    }
}