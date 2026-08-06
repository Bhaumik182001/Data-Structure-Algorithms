class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int row = grid.length;
        int column = grid[0].length;
        int islandCount = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(grid[i][j] == '1'){
                    islandCount++;
                    dfs(i, j, row, column, grid);
                }
            }
        }

        return islandCount;
    }

    private void dfs(int r, int c,int row, int column, char[][] grid){
        if(r < 0 || r >= row || c < 0 || c >= column || grid[r][c] == '0') return;

        grid[r][c] = '0';

        dfs(r, c + 1, row, column, grid);
        dfs(r + 1, c, row, column, grid);
        dfs(r, c - 1, row, column, grid);
        dfs(r - 1, c, row, column, grid);
    }
}