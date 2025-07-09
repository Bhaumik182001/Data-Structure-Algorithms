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
    String res = "~";
    

    void pre(TreeNode root, String curr){
        if(root == null) return;

        curr = (char)(root.val + 'a') + curr;
        if(root.left == null && root.right == null){
            if (curr.compareTo(res) < 0) res = curr;
        } 
        
        pre(root.left, curr);
        pre(root.right, curr);
    }

    public String smallestFromLeaf(TreeNode root) {
        pre(root, "");
        return res;
    }
}