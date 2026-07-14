import java.util.ArrayList;
import java.util.List;

class Solution {
    private int getMaxRowIndex(int[][] mat, int col, int numRows) {
        
        int maxVal = Integer.MIN_VALUE;
        int maxRow = -1;
        for (int r = 0; r < numRows; r++) {
            if (mat[r][col] > maxVal) {
                maxVal = mat[r][col];
                maxRow = r;
            }
        }
        return maxRow;
    }

    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0;
        int high = m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int maxRow = getMaxRowIndex(mat, mid, n);
            
            int leftVal = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : Integer.MIN_VALUE;
            int rightVal = (mid + 1 < m) ? mat[maxRow][mid + 1] : Integer.MIN_VALUE;
            int currVal = mat[maxRow][mid];
            
            if (currVal >= leftVal && currVal >= rightVal) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(maxRow);
                result.add(mid);
                return result;
            }

            else if (leftVal > currVal) {
                high = mid - 1;
            } 

            else {
                low = mid + 1;
            }
        }
        
        return new ArrayList<>(); // Fallback
    }
}