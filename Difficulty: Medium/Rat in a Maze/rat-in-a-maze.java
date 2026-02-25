class Solution {
    private static final int[] dx = {1, 0, 0, -1};
    private static final int[] dy = {0, -1, 1, 0};
    private static final char[] moves = {'D', 'L', 'R', 'U'};
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;
        
        if(maze[0][0] == 0 || maze[n - 1][n - 1] == 0) return res;
        
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        
        dfs(maze, 0, 0, n, "", res, visited);
        
        return res;
    }
    
    public void dfs(int[][] maze, int r, int c, int n, String path, ArrayList<String> res, boolean[][] visited){
        if(r == n- 1 && c == n - 1){
            res.add(path);
            return;
        }
        
        for(int i = 0; i < 4; i++){
            int x = r + dx[i];
            int y = c + dy[i];
            
            if(x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && maze[x][y] ==1){
                visited[x][y] = true;
                dfs(maze, x, y, n, path + moves[i], res, visited);
                visited[x][y] = false;
            }
        }
    }
}