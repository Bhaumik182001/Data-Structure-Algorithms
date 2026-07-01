class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st  = new Stack<>();
        int ans = 0;

        for(int i = 0; i < op.length; i++){
            if(op[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            } else if(op[i].equals("D")){
                int a = st.pop();
                st.push(a);
                st.push(a * 2);
            } else if(op[i].equals("C")){
                st.pop();
            } else {
                int a = Integer.parseInt(op[i]);
                st.push(a);
            }
        }

        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
}