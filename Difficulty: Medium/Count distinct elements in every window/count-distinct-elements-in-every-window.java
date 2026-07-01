class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < k; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        list.add(hm.size());
        
        int left = 0;
        
        for(int right = k; right < arr.length; right++){
            hm.put(arr[right], hm.getOrDefault(arr[right], 0) + 1);
            hm.put(arr[left], hm.get(arr[left]) - 1);
            
            if(hm.get(arr[left]) == 0) hm.remove(arr[left]);
            left++;
            
            list.add(hm.size());
        }
        
        return list;
    }
}