class Solution {
    public int reverseBits(int n) {
        String res = "";

        while(n != 0){
            res = res + (n % 2);
            n /= 2;
        }

        int len = res.length();

        while(len < 32){
            res = res + "0";
            len++;
        }

        int ans = 0;
        int expo = 0;

        for(int i = 31; i >= 0; i--){
            if(res.charAt(i) == '1') ans += Math.pow(2, expo);
            expo++;
        }

       
        return ans;
    }
}