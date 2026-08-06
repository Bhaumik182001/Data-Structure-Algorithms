class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < v; i++) adj.add(new ArrayList<>());
        
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        int[] color = new int[v];    
    
        return solve(0, v, adj, m, color);
    }
    
    private boolean solve(int node, int v, List<List<Integer>> adj, int m, int[] color){
        if(node == v) return true;
        
        for(int c = 1; c <= m; c++){
            if(isSafe(node, adj, color, c)){
                color[node] = c;
                
                if(solve(node + 1, v, adj, m, color)) return true;
                
                color[node] = 0;
            }
        }
        
        return false;
    }
    
    private boolean isSafe(int node, List<List<Integer>> adj, int[] color, int c){
        for(int neighbour: adj.get(node)){
            if(color[neighbour] == c) return false;
        }
        
        return true;
    }
}