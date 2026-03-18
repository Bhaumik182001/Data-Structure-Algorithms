class Solution {
    public int smallestBalancedIndex(int[] nums) {

        long[] postProd = new long[nums.length + 1];

        long pre = 0;
        long post = 1;
        
        long limit = 200_000_000_000_000L; 

        for(int i = 0; i < nums.length; i++){
            pre += nums[i];
            
            if (post > limit / nums[nums.length - i - 1]) {
                post = limit + 1;
            } else {
                post *= nums[nums.length - i - 1];
            }
            
            postProd[nums.length - i - 1] = post;
        }

        int ans = -1;
        postProd[nums.length] = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            pre -= nums[i];
            if(pre == postProd[i + 1]) ans = i;
        }

        return ans;
    }
}