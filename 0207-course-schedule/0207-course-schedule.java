class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<Integer>[] adj = new ArrayList[V];

        for(int i = 0; i < V; i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            adj[edge[0]].add(edge[1]);
        }

        int[] indegree = new int[V];

        for(int i = 0; i < V; i++){
            for(int num: adj[i]){
                indegree[num]++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int val = q.remove();
            res.add(val);

            for(int num: adj[val]){
                indegree[num]--;
                if(indegree[num] == 0){
                    q.offer(num);
                }
            }
        }

        return res.size() == V;
    }
}