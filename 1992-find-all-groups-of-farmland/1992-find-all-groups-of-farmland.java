class Solution {
    int rr = 0;
    int cc = 0;

    void dfs(int[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] == -1 || grid[i][j] == 0) return;

        grid[i][j] = -1;

        dfs(grid, i, j + 1, r, c);
        cc = Math.max(cc, j);
        dfs(grid, i + 1, j, r, c);
        rr = Math.max(rr, i);;
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i - 1, j, r, c);
    }


    public int[][] findFarmland(int[][] land) {
        int r = land.length;
        int c = land[0].length;
        ArrayList<int[]> res = new ArrayList<>();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                int[] arr = new int[4];
                boolean found = false;
                if(land[i][j] == 1){
                    found = true;
                    arr[0] = i;
                    arr[1] = j;
                    rr = 0;
                    cc = 0;
                    dfs(land, i, j, r, c);
                    arr[2] = rr;
                    arr[3] = cc;
                }
                if(found == true) res.add(arr);
            }
        }

        int[][] ans = new int[res.size()][];
        int index = 0;

        for(int[] arr : res){
            ans[index++] = arr;
        }

        return ans;
    }
}