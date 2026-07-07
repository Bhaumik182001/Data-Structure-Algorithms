class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int h = 0;

        left[0] = height[0];
        right[n - 1] = height[n - 1];

        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for(int j = n - 2; j >= 0; j--){
            right[j] = Math.max(height[j], right[j + 1]);
        }

        for(int i = 0; i < n; i++){
            h += Math.min(left[i], right[i]) - height[i];
        }

        return h;
    }
}