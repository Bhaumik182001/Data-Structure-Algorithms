class Solution {
    int countOnes(int n){
        int count = 0;

        while(n != 0){
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    public int[] sortByBits(int[] arr) {
        ArrayList<int[]> res = new ArrayList<>();

        for(int num : arr){
            int val = countOnes(num);
            res.add(new int[]{num, val});
            // hm.put(num, val);
        }

        res.sort((a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]); 
            }
            return Integer.compare(a[1], b[1]);
        });

        int[] ans = new int[arr.length];
        
        int i= 0;

        for(int[] nums : res){
            ans[i++] = nums[0];
        }
        return ans;
    }
}