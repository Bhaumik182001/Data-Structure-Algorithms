class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] ans = new int[nums.length];
        int n = nums.length;

        int pre = 1;
        int post = 1;

        for(int i = 0; i < n; i++){
            pre *= nums[i];
            post *= nums[n - i - 1];
            prefix[i] = pre;
            postfix[n - i - 1] = post;
        }

        ans[0] = postfix[1];
        ans[n - 1] = prefix[n - 2];

        for(int i = 1; i < n - 1; i++){
            ans[i] = prefix[i - 1] * postfix[i + 1];
        }

        return ans;
    }
}