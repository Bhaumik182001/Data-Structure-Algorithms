class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = k - 1;

        while(l < r){
            arr[l] = s.charAt(r);
            arr[r] = s.charAt(l);
            l++;
            r--;
        }

        return new String(arr);
    }
}