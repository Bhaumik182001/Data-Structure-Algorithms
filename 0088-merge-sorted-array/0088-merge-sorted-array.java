class Solution {
    public void merge(int[] a, int m, int[] b, int n) {     
        int[] ans = new int[m + n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < m && j < n){
            if(a[i] > b[j]){
                ans[k++] = b[j++];
            } else {
                ans[k++] = a[i++];
            }
        }
        
        while(i < m){
             ans[k++] = a[i++];
        }
        
        while(j < n){
             ans[k++] = b[j++];
        }

        for(int c = 0; c < a.length; c++){
            a[c] = ans[c];
        }
        
    }
}