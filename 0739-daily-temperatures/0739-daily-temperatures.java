class Solution {
    class Pair<K,V> {
        K first;
        V second;

        public Pair(K k, V v){
            this.first = k;
            this.second = v;
        }
    }

    public int[] dailyTemperatures(int[] temp) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        int[] res = new int[temp.length];

        for(int i = temp.length - 1; i >= 0; i--){
            if(stack.isEmpty()) res[i] = 0;
            else {
                while(!stack.isEmpty() && temp[i] >= stack.peek().first){
                    stack.pop();
                }
                if(stack.isEmpty()) res[i] = 0;
                else res[i] = stack.peek().second - i;
            }
            stack.push(new Pair(temp[i], i));
        }

        return res; 
    }
}