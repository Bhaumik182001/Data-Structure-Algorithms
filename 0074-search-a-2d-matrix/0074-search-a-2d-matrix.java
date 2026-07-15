class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int rowLen = matrix[0].length;

        for(int i = 0; i < len; i++){
            if(matrix[i][0] <= target && target <= matrix[i][rowLen - 1]){
                int low = 0;
                int high = rowLen - 1;

                while(low <= high){
                    int mid = low + (high - low) / 2;

                    if(matrix[i][mid] == target) return true;

                    if(target < matrix[i][mid]) high = mid - 1;
                    else low = mid + 1;
                }
            }
        }

        return false;
    }
}