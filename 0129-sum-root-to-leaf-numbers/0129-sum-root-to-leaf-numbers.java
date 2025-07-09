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
    int sol(TreeNode root, int sum){
        if(root == null) return sum;

        sum = (sum * 10) + root.val;
        return sol(root.left, sum) + sol(root.right, sum);
        
    }

    public int sumNumbers(TreeNode root) {
        return sol(root, 0) / 2;
    }
}