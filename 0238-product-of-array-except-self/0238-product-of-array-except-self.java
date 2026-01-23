class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        int prefix = 1;
        int postfix = 1;
        
        for(int i = 0; i < n; i++){
            prefix *= nums[i];
            postfix *= nums[n-i-1];
            pre[i] = prefix;
            post[n-i-1] = postfix;
        }

       
        ans[0] = post[1];
        ans[n-1] = pre[n-2];

        for(int i = 1; i < n-1; i++){
            ans[i] = pre[i-1]*post[i+1];
        }


        return ans;     
    }
}