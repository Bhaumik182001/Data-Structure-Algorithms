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
    Map<Integer, Integer> mapping;
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        mapping = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            mapping.put(inorder[i], i);
        }

        postIndex = inorder.length - 1;
        return build(postorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] postorder, int start, int end){
        if (start > end) return null;

        int val = postorder[postIndex--];
        TreeNode root = new TreeNode(val);
        int mid = mapping.get(val);

        root.right = build(postorder, mid + 1, end);
        root.left = build(postorder, start, mid - 1);
    
        return root;
    }
}

