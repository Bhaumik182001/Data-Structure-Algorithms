/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/


class Solution {
    static int pre1(Node root, int val){
        if(root == null) return val;
        val = Math.max(root.data, val);
        return Math.max(pre1(root.left, val), pre1(root.right, val));
    }
    
    static int pre2(Node root, int val){
        if(root == null) return val;
        val = Math.min(root.data, val);
        return Math.min(pre2(root.left, val), pre2(root.right, val));
    }
    
    public static int findMax(Node root) {
        return pre1(root, root.data);
        
    }

    public static int findMin(Node root) {
        return pre2(root, root.data);
    }
}