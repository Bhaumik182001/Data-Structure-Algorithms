class Solution {
    int calc(int n){
        int val = 0;
        
        while(n != 0){
            int rem = n % 10;
            val += rem * rem;
            n /= 10;
        }

        return val;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = calc(slow);
            fast = calc(fast);
            fast = calc(fast);

            if(fast == 1) return true;
        } while(fast != slow);

        return false;
    }
}