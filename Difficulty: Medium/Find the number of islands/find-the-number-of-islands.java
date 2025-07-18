class Solution {
    
    int temp = 0;
    
    void dfs(char[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] == 'W') return;
    
        grid[i][j] = 'W';
       
    
        
        dfs(grid, i, j + 1, r, c);
        dfs(grid, i - 1, j + 1, r, c);
        dfs(grid, i - 1, j, r, c);
        dfs(grid, i- 1, j - 1, r, c);
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i + 1, j - 1, r, c);
        dfs(grid, i + 1, j, r, c);
        dfs(grid, i + 1, j + 1, r, c);
    }
    
    
    public int countIslands(char[][] grid) {
        // Code here
        int r = grid.length;
        int c = grid[0].length;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 'L'){
                    dfs(grid, i, j, r, c);
                    temp++;
                }
               
            }
        }
        
        return temp;
    }
}