class Solution {
    public ArrayList<Integer> nextLargerElement(int[] nums) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums.length - 1; i >= 0; i--){
            if(stack.isEmpty()){
                res.add(0, -1);
            } else{
                while(!stack.isEmpty() && stack.peek() <= nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty()) res.add(0, -1);
                else res.add(0, stack.peek());
            }
            stack.push(nums[i]);
        }
        
        return res;
    }
}