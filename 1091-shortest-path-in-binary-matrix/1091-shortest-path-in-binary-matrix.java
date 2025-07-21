class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int d = 1;
        if(grid[0][0] == 1 || grid[r-1][c-1] == 1) return -1;
        Queue<int[]> res = new LinkedList<>();
        res.offer(new int[]{0,0});
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         if(grid[i][j] == 0){
        //             res.offer(new int[]{i, j});
        //         }
        //     }
        // }
        int[] dx = {0,0,1,-1,-1,-1,1,1};
        int[] dy = {1,-1,0,0,1,-1,1,-1};
        while(!res.isEmpty()){
            int size = res.size();
            for(int i = 0; i < size; i++){
                int[] temp = res.remove();
                if(temp[0] == r - 1 && temp[1] == c - 1){
                    return d;
                }
                for(int j = 0; j < 8; j++){
                    int x = temp[0] + dx[j];
                    int y = temp[1] + dy[j];
                  // d = grid[temp[0]][temp[1]];
                    if(x >= 0 && y >= 0 && y < c && x < r && grid[x][y] == 0){
                        grid[x][y] =1;
                        res.offer(new int[]{x, y});
                    }
                }
            }
             d++;
        }
        return -1;
    }
}