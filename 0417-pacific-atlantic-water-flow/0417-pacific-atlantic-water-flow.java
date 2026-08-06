class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if(heights == null || heights.length == 0) return result;

        int row = heights.length;
        int column = heights[0].length;

        int n = row;

        boolean[][] pacific = new boolean[row][column];
        boolean[][] atlantic = new boolean[row][column];

        for(int c = 0; c < column; c++){
            dfs(0, c, row, column, Integer.MIN_VALUE, pacific, heights);
            dfs(row - 1, c, row, column, Integer.MIN_VALUE, atlantic, heights);
        }

        for(int r = 0; r < row; r++){
            dfs(r, 0, row, column, Integer.MIN_VALUE, pacific, heights);
            dfs(r, column - 1, row, column, Integer.MIN_VALUE, atlantic, heights);
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(pacific[i][j] == true && atlantic[i][j] == true) result.add(Arrays.asList(i, j));
            }
        }

        return result;
    }

    void dfs(int r, int c, int row, int column, int previousHeight, boolean[][] ocean, int[][] height){
        if(r < 0 || r >= row || c < 0 || c >= column || ocean[r][c] == true || height[r][c] < previousHeight) return;

        ocean[r][c] = true;

        dfs(r, c + 1, row, column, height[r][c], ocean, height);
        dfs(r + 1, c, row, column, height[r][c], ocean, height);
        dfs(r, c - 1, row, column, height[r][c], ocean, height);
        dfs(r - 1, c, row, column, height[r][c], ocean, height);
    }
}