class Solution {
    public boolean isSubsequence(String s, String t) {
       boolean toggle = true;
       int pointer = -1;

       for(int i=0;i<s.length();i++){
            toggle=false;
            for(int j=0;j<t.length();j++){
               if(s.charAt(i)==t.charAt(j)) {
                    if(j>pointer) {
                        toggle=true;
                        pointer = j;
                        break;
                    }
                }
            }
           if(!toggle) return false;
       } 
       return toggle;
    }
}