class Solution {
    public int findCenter(int[][] edges) {
        int res = -1;
        int a = edges[0][0];
        int b = edges[0][1];

        for(int i = 1; i < edges.length; i++){
            if(edges[i][0] == a) res = a;
            if(edges[i][0] == b) res = b;

            if(edges[i][1] == a) res = a;
            if(edges[i][1] == b) res = b;
        }
        return res;
    }
}