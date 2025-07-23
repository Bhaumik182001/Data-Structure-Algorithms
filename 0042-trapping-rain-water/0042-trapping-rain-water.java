class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int h = 0;
        int n = height.length;
        
        left[0] = height[0];
        right[n-1] = height[n-1];

        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for(int j = height.length - 2; j > -1; j--){
            right[j] = Math.max(right[j + 1], height[j]);
        }

        for(int i = 0; i < height.length; i++){
            h += Math.min(left[i], right[i]) - height[i];
        }

        return h;
    }
}