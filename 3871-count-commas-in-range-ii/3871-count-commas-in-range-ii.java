class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long limit = 999;
        
        while (n > limit) {
            commas += (n - limit);
            if (limit > Long.MAX_VALUE / 1000) break;
            
            limit = limit * 1000 + 999; 
        }
        
        return commas;
    }
}