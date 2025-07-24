class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++){
            int start = 0;
            int end = matrix.length - 1;

            while(start < end){
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            System.out.println();
        }
    }
}