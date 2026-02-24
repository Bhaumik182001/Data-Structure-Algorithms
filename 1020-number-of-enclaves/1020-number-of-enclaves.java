class Solution {
    int count = 0;

    void dfsB(int[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] != 1) return;

        grid[i][j] = -1;

        dfsB(grid, i, j + 1, r, c);
        dfsB(grid, i - 1, j, r, c);
        dfsB(grid, i, j - 1, r, c);
        dfsB(grid, i + 1, j, r, c);
    }

    void dfs(int[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] == 1) return;

        grid[i][j] = 0;

        dfs(grid, i, j + 1, r, c);
        dfs(grid, i - 1, j, r, c);
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i + 1, j, r, c);
    }


    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                boolean isBorder = (i == 0 || j == 0 || i == (r - 1) || j == (c - 1));
                if(grid[i][j] == 1 && isBorder){
                    dfsB(grid, i, j, r, c);
                }  

            }
        }


        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                boolean isBorder = (i == 0 || j == 0 || i == (r - 1) || j == (c - 1));
                if(grid[i][j] == 1 && !isBorder){
                    dfs(grid, i, j, r, c);
                    count++;
                }  

            }
        }

        return count;

        
    }
    
}
