class Solution {
    void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 2){
               swap(nums, mid, high--);
            } else if(nums[mid] == 0){
                swap(nums, mid++, low++);
            }else {
                mid++;
            }
            
            
        }
    }
}