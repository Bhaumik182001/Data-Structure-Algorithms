class Solution {
    
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int min = 0;

        int r = grid.length;
        int c = grid[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    fresh++;
                } else if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();

            for(int i = 0; i < size; i++){
                int[] node = q.remove();

                for(int j = 0; j < 4; j++){
                    int x = node[0] + dx[j];
                    int y = node[1] + dy[j];

                    if(x >= 0 && y >= 0 && x<r && y<c && grid[x][y] == 1){
                        q.offer(new int[]{x, y});
                        grid[x][y] = 2;
                        fresh--;

                    }
                }  
            }

            min++;
        }

        return fresh == 0 ? min : -1;
    }
}