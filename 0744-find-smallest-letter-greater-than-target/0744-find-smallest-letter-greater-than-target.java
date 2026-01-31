class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        char ans = letters[0];

        while(low <= high){
            int mid = (low + high)/2;
            if((int)letters[mid] > (int)target){
                high = mid - 1;
                ans = letters[mid];
            } else {
                low = mid + 1;
            }
        
        }

        return ans;
    }
}