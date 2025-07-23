class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else {
                if(st.empty()) return false;
                char res = st.pop();
                if((res == '(' && c == ')') || (res == '[' && c == ']') || (res == '{' && c == '}')) continue;
                else return false;
            }
        }

        return st.empty();
        
    }
}