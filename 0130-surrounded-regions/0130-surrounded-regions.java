class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;

        int row = board.length;
        int column = board[0].length;

        for(int c = 0; c < column; c++){
            if(board[0][c] == 'O') dfs(0, c, row, column, board);
            if(board[row - 1][c] == 'O') dfs(row - 1, c, row, column, board);    
        }

        for(int r = 0; r < row; r++){
            if(board[r][0] == 'O') dfs(r, 0, row, column, board);
            if(board[r][column - 1] == 'O') dfs(r, column - 1, row, column, board);
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    private void dfs(int r, int c, int row, int column, char[][] board){
        if(r < 0 || r >= row || c < 0 || c >= column || board[r][c] != 'O') return;

        board[r][c] = 'T';

        dfs(r, c + 1, row, column, board);
        dfs(r + 1, c, row, column, board);
        dfs(r, c - 1, row, column, board);
        dfs(r - 1, c, row, column, board);
    }
}