class Solution {
 

    int temp = 0;

    void dfs(int[][] grid, int i, int j, int r, int c){
        if(i == r || j == c || i < 0 || j < 0 || grid[i][j] == 0){
            temp++;
            return;
        }

        if(grid[i][j] == -1) return; 

        grid[i][j] = -1;

        dfs(grid, i, j + 1, r, c);
        dfs(grid, i - 1, j, r, c);
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i + 1, j, r, c);
        
    }

    public int islandPerimeter(int[][] grid) {
            
        int r = grid.length;
        int c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j, r, c);
                    break;
                }  
            }
        }
   
        return temp;
    }
    
    
}