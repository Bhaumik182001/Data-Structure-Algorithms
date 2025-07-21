class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int m = 0;
        Queue<int[]> res = new LinkedList<>();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j] == 0){
                    res.offer(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        while(!res.isEmpty()){
            m++;
            int size = res.size();
            for(int i = 0; i < size; i++){
                int[] temp = res.remove();
                for(int j = 0; j < 4; j++){
                    int x = temp[0] + dx[j];
                    int y = temp[1] + dy[j];
                    if(x >= 0 && y >= 0 && x < r && y < c && mat[x][y] > 1 + mat[temp[0]][temp[1]]){
                        mat[x][y] = 1 + mat[temp[0]][temp[1]];
                        res.offer(new int[]{x, y});
                    }
                }
            }
        }
    return mat;
    }
}