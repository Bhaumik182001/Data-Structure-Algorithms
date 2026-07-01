class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        long[] freq = new long[k];
        long count = 0;
        
        for(int num : arr){
            int rem = ((num % k) + k) % k;
            freq[rem]++;
        }
        
        count += (freq[0] * (freq[0] - 1)) / 2;
        
        for(int i = 1; i <= k/2; i++){
            if(i == k - i) count += (freq[i] * (freq[i] - 1)) / 2;
            else count += freq[i] * freq[k - i];
        }
        
        return (int)count;
    }
}