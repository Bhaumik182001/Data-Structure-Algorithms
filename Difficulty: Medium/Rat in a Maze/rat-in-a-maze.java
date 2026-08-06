class Solution {
    private static final int[] dRow = {1, 0, 0, -1};
    private static final int[] dCol = {0, -1, 1, 0};
    private static final char[] dirChar = {'D', 'L', 'R', 'U'};
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0) return result;
        
        StringBuilder currentPath = new StringBuilder();
        
        backtrack(0, 0, n, maze, currentPath, result);
        
        return result;
    }
    
    private void backtrack(int row, int column, int n, int[][] maze, StringBuilder currentPath, List<String> result){
        if(row == n-1 && column == n - 1){
            result.add(currentPath.toString());
            return;
        }
        
        maze[row][column] = 0;
        
        for(int i = 0; i < 4; i++){
            int newRow = row + dRow[i];
            int newColumn = column + dCol[i];
            
            if(newRow >= 0 && newRow < n && newColumn >= 0 && newColumn < n && maze[newRow][newColumn] == 1){
                currentPath.append(dirChar[i]);
                backtrack(newRow, newColumn, n, maze, currentPath, result);
                currentPath.deleteCharAt(currentPath.length() - 1);
            }
        }
        
        maze[row][column] = 1;
    }
}