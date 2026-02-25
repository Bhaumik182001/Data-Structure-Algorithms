class Solution {
    public int scoreDifference(int[] nums) {
        int playerA = 0;
        int playerB = 0;
        boolean toggle = true;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0) toggle = !toggle;
            if((i + 1) % 6 == 0) toggle = !toggle;
            

            if(toggle) playerA += nums[i];
            else playerB += nums[i];
        }

        return playerA - playerB;
    }
}