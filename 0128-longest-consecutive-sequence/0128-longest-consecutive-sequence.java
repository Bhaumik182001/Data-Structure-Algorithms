class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }

        for(int num : hs){
            if(!hs.contains(num - 1)){
                int currentNumber = num;
                int streak = 1;

                while(hs.contains(currentNumber + 1)){
                    streak++;
                    currentNumber++;
                }

                max = Math.max(max, streak);
            }
        }

        return max;
    }
}