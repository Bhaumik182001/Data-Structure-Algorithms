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
    TreeNode sol(int[] arr, int low, int high){
      
         if(low > high) return null;
        int mid = (low + high) / 2;
        TreeNode temp = new TreeNode(arr[mid]);
        temp.left = sol(arr, low, mid - 1);
        temp.right = sol(arr, mid + 1, high);
    
        return temp;
    }

    public TreeNode sortedArrayToBST(int[] nums) {


        if(nums.length == 0) return null;

        TreeNode head = sol(nums, 0, nums.length - 1);

        return head;
    }
}