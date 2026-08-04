class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(backtrack(i, j, 0, row, column, board, word)) return true;
            }
        }

        return false;
    }

    private boolean backtrack(int r, int c, int index, int row, int column, char[][] board, String word){
        if(index == word.length()) return true;

        if(r < 0 || r >= row || c < 0 || c >= column || board[r][c] != word.charAt(index)) return false;

        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = backtrack(r, c + 1, index + 1, row, column, board, word)
                        || backtrack(r + 1, c, index + 1, row, column, board, word)
                        || backtrack(r, c - 1, index + 1, row, column, board, word)
                        || backtrack(r - 1, c, index + 1, row, column, board, word);

        board[r][c] = temp;

        return found;
    }
}