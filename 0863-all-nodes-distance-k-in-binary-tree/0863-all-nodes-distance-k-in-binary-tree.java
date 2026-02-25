class Solution {
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        mapParents(root, null);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>(); 

        q.offer(target);
        visited.add(target);
        int currentDistance = 0;

        while (!q.isEmpty()) {
        
            if (currentDistance == k) {
                for (TreeNode node : q) {
                    res.add(node.val);
                }
                return res; 
            }

            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();

                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    q.offer(current.left);
                }
                
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    q.offer(current.right);
                }
                
                TreeNode parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    q.offer(parent);
                }
            }
            
            currentDistance++; 
        }

        return res; 
    }

    
    private void mapParents(TreeNode node, TreeNode parent) {
        if (node == null) return;
        
        parentMap.put(node, parent);
        
        mapParents(node.left, node);
        mapParents(node.right, node);
    }
}