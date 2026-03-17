class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            if(num % 2 == 0) hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if(num % 2 == 0 && hm.get(num) == 1) return num;
        }

        return -1;
    }
}