/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int sum(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return sum(root.left) + sum(root.right);
    }
    
    int countLeaves(Node root) {
        return sum(root);
    }
}