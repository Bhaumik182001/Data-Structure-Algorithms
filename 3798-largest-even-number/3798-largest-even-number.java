class Solution {
    public String largestEven(String s) {
        int right = s.length() - 1;
        while(right >= 0 && s.charAt(right) != '2'){
            right--;
        }

        if(right == 0 && s.charAt(right) != '2') return "";

        return s.substring(0, right + 1);
    }
}