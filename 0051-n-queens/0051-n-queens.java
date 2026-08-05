class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diagonal1 = new boolean[2 * n];
        boolean[] diagonal2 = new boolean[2 * n]; 

        backtrack(0, n, board, cols, diagonal1, diagonal2, result);

        return result;
    }

    private void backtrack(int row, int n, char[][] board, boolean[] cols, boolean[] diagonal1, boolean[] diagonal2, List<List<String>> result){
        
        if(row == n){
            result.add(createChessBoard(board));
        }

        for(int column = 0; column < n; column++){
            int d1 = row + column;
            int d2 = row - column + n;

            if(cols[column] || diagonal1[d1] || diagonal2[d2]) continue;

            board[row][column] = 'Q';
            cols[column] = true;
            diagonal1[d1] = true;
            diagonal2[d2] = true;

            backtrack(row + 1, n, board, cols, diagonal1, diagonal2, result);

            board[row][column] = '.';
            cols[column] = false;
            diagonal1[d1] = false;
            diagonal2[d2] = false;
        }
    }

    private List<String> createChessBoard(char[][] board){
        List<String> res = new ArrayList<>();

        for(char[] row : board){
            res.add(new String(row));
        }

        return res;
    }
}