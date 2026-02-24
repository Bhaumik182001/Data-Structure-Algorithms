class Solution {
    void dfsB(char[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] != 'O') return;

        grid[i][j] = 'S';

        dfsB(grid, i, j + 1, r, c);
        dfsB(grid, i - 1, j, r, c);
        dfsB(grid, i, j - 1, r, c);
        dfsB(grid, i + 1, j, r, c);
    }

    void dfs(char[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] != 'O') return;

        grid[i][j] = 'X';

        dfs(grid, i, j + 1, r, c);
        dfs(grid, i - 1, j, r, c);
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i + 1, j, r, c);
    }

    void dfsR(char[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] != 'S') return;

        grid[i][j] = 'O';

        dfsR(grid, i, j + 1, r, c);
        dfsR(grid, i - 1, j, r, c);
        dfsR(grid, i, j - 1, r, c);
        dfsR(grid, i + 1, j, r, c);
    }

    public void fill(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                boolean isBorder = (i == 0 || j == 0 || i == (r - 1) || j == (c - 1));
                if(grid[i][j] == 'O' && isBorder){
                    dfsB(grid, i, j, r, c);
                }  

            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 'O'){
                    dfs(grid, i, j, r, c);
                } 
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 'S'){
                    dfsR(grid, i, j, r, c);
                } 
            }
        }
    }
    
}
