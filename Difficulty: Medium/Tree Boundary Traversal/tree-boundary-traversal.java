class Solution {

    void addLeftBoundary(Node node, List<Integer> res) {
        Node curr = node.left;
        while (curr != null) {
            if (!isLeaf(curr)) res.add(curr.data);
            curr = (curr.left != null) ? curr.left : curr.right;
        }
    }

    void addRightBoundary(Node node, List<Integer> res) {
        Node curr = node.right;
        Stack<Integer> stack = new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr)) stack.push(curr.data);
            curr = (curr.right != null) ? curr.right : curr.left;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop()); 
        }
    }

    void addLeaves(Node node, List<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }

    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) return res;

        if (!isLeaf(node)) res.add(node.data);  
        addLeftBoundary(node, res);
        addLeaves(node, res);
        addRightBoundary(node, res);

        return res;
    }
}
