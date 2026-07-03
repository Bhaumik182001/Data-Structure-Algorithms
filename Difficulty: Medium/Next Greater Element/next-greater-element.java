class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(st.isEmpty()){ 
                res.add(0, -1);
            } else {
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
                
                if(st.isEmpty()) res.add(0, -1);
                else res.add(0, st.peek());
            }
            st.push(arr[i]);
        }
        
        return res;
    }
}