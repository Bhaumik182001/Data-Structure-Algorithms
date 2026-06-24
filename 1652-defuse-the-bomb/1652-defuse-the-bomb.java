class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];

        if(k == 0) return ans;

        int start = 1;
        int end = k;

        if(k < 0){
            start = len - Math.abs(k);
            end = len - 1;
        }

        int sum = 0;

        for(int i = start; i <= end; i++){
            sum += code[i];
        }

        for(int i = 0; i < code.length; i++){
            ans[i] = sum;

            sum -= code[start % len];
            
            start++;
            end++;

            sum += code[end % len];

        }

        return ans;
    }
}