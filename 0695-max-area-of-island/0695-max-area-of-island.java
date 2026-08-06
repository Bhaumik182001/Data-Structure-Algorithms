class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int row = grid.length;
        int column = grid[0].length;
        int maxArea = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(grid[i][j] == 1){
                    
                    maxArea = Math.max(maxArea, dfs(i, j, row, column, grid));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int r, int c, int row, int column, int[][] grid){
        if(r < 0 || r >= row || c < 0 || c >= column || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;

        return 1 + dfs(r, c + 1, row, column, grid)
        + dfs(r + 1, c, row, column, grid)
        + dfs(r, c - 1, row, column, grid)
        + dfs(r - 1, c, row, column, grid);
    }
}