class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // Minimum possible open '(' needed
        int maxOpen = 0; // Maximum possible open '(' allowed

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                minOpen--; // If '*' acts as ')'
                maxOpen++; // If '*' acts as '('
            }

            // If maximum possible open brackets drops below 0, too many ')'
            if (maxOpen < 0) {
                return false;
            }

            // minOpen cannot be negative (we can't match non-existent '(')
            if (minOpen < 0) {
                minOpen = 0;
            }
        }

        // String is valid if we can achieve 0 unclosed '(' at the end
        return minOpen == 0;
    }
}