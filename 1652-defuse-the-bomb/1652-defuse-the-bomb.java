class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];
        if(k == 0) {
            for(int i = 0; i < code.length; i++){
                code[i] = 0;
            }
            return code;
        }

        int sum = 0;
        int left = -1;
        int right = -1;

        if(k > 0){
            for(int i = 1; i <= k; i++){
                sum += code[i];
            }
            left = 1;
            right = k;
        } else {
            for(int i = len + k; i < len; i++){
                sum += code[i];
            }
            left = len + k;
            right = len - 1;
        }

        for(int i = 0; i < code.length; i++){
            ans[i] = sum;
            sum -= code[left++];
            left %= len;
            right++;
            right %= len;
            sum += code[right];
        }

        return ans;
    }
}