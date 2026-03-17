class Solution {
    long gcd(long a, long b){ 
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {
        long[] preGcd = new long[nums.length];
        
        int max = 0;
        int index = 0;
    
        for(int num : nums){
            max = Math.max(max, num);
            preGcd[index++] = gcd(max, num);
        }

        Arrays.sort(preGcd);

        long ans = 0;

        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            ans += gcd(preGcd[i], preGcd[j]);
            i++;
            j--;
        }

        return ans;
    }
}