class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean toggle = true;
        int pointer = -1;

        for(int i = 0; i < s.length(); i++){
            toggle = false;
            for(int j = i; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j) && pointer < j){
                    toggle = true;
                    pointer = j;
                    break;
                }
            }
            if(toggle == false) return false;
        }

        return true;
    }
}