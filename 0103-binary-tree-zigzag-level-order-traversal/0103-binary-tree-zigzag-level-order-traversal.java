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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int count = 0;

        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();

                level.add(temp.val);

                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }

            if(count % 2 != 0) Collections.reverse(level);

            res.add(level);
            count++;
        }

        return res;
    }
}