class Solution {
    public int mirrorDistance(int n) {
        int mirror = 0;
        int val = n;

        while(val != 0){
            int rem = val % 10;
            val /= 10;
            mirror = (mirror * 10) + rem;
        }

        return Math.abs(n - mirror);
    }
}