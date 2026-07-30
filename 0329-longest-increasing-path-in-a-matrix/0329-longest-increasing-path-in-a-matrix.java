class Solution {
    private final static int[][] DIRECTIONS = {{0, 1},{1, 0},{0, -1},{-1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] memo = new int[row][column];
        int maxLength = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                maxLength = Math.max(maxLength, dfs(matrix, i, j, memo));
            }
        }

        return maxLength;
    }

    private int dfs(int[][] matrix, int r, int c, int[][] memo){
        if(memo[r][c] != 0) return memo[r][c];

        int len = 1;

        for(int[] dir : DIRECTIONS){
            int newRow = r + dir[0];
            int newColumn = c + dir[1];

            if(newRow >= 0 && newRow < matrix.length &&
                newColumn >= 0 && newColumn < matrix[0].length &&
                matrix[newRow][newColumn] > matrix[r][c]
            )
            len = Math.max(len, 1 + dfs(matrix, newRow, newColumn, memo));
        }

        memo[r][c] = len;

        return len;
    }
}