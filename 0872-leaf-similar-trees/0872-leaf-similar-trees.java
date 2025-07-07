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
    void leaf(TreeNode root, List<Integer> res){
        if(root == null) return;
        if(root.left == null && root.right == null) res.add(root.val);
        leaf(root.left, res);
        leaf(root.right, res);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        leaf(root1, res1);
        leaf(root2, res2);

        return res1.equals(res2);
    }
}