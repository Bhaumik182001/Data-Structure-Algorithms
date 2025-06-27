class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n > 0) {
            int res = n & (n-1);
            if(res == 0) return true;
        }
        return false;
    }
}