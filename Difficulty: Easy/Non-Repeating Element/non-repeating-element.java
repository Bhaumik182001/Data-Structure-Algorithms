class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int num : arr){
            if(hm.get(num) == 1) return num;
        }
        
        return 0;
    }
}
