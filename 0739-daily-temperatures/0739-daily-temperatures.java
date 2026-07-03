class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[len];

        for(int i = 0; i < len; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                int diff = i - prev;
                res[prev] = diff;
            }

            st.push(i);
        }

        return res;
    }
}