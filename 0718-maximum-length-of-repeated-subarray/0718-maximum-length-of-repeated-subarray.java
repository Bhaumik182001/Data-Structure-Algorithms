class Solution {
    int sub(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        int max = 0;

        int[][] res = new int[m+1][n+1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(nums1[i - 1] == nums2[j - 1]){
                    res[i][j] = 1 + res[i - 1][j - 1];
                    max = Math.max(max, 1 + res[i - 1][j - 1]);
                } else {
                    res[i][j] = 0;
                }
            }
        }

        return max;
    }

    public int findLength(int[] nums1, int[] nums2) {
        return sub(nums1, nums2);
    }
}