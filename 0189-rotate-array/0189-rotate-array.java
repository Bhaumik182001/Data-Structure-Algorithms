class Solution {
    void rot(int[] nums){
        int temp = nums[nums.length - 1];

        for(int i = nums.length -1; i > 0; i--){
            nums[i] = nums[i-1];
        }

        nums[0] = temp;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int[] copy = new int[nums.length];

        int point = nums.length - k;
        int j = 0;

        for(int i = point; i < nums.length; i++){
            copy[j++] = nums[i];
        }
        
        for(int i = 0; i < point; i++){
            copy[j++] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = copy[i];
        }
    }
}