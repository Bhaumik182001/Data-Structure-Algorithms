class Solution {
    void dfs(int[][] image, int i, int j, int old, int color){
        if(i < 0 || j < 0 || i == image.length || j == image[0].length || image[i][j] != old || image[i][j] == color) return;
        
        image[i][j] = color;

        dfs(image, i , j + 1, old, color);
        dfs(image, i - 1 , j, old, color);
        dfs(image, i , j - 1, old, color);
        dfs(image, i + 1 , j, old, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
}