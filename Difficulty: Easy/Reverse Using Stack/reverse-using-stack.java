class Solution {
    public String reverse(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            st.push(s.charAt(i));
        }
        
        String res = "";
        
        while(!st.isEmpty()){
            res += st.pop();
        }
        
        return res;
    }
}