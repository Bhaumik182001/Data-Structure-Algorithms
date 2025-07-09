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
   

    void pre(TreeNode root, int target, int sum,  List<Integer> temp, List<List<Integer>> res){
        if(root == null) return;
        
        temp.add(root.val);
        sum += root.val;
        
        if(root.left == null && root.right == null){
            if(sum == target) res.add(new ArrayList<>(temp));
        }

        pre(root.left, target, sum, temp, res);
        pre(root.right, target, sum, temp, res);

        temp.remove(temp.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        pre(root, targetSum, 0, temp, res);
        return res;
    }
}