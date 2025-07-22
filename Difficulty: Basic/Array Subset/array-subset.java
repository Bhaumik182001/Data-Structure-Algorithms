
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> arr1 = new HashMap<>();
        
        for(int i = 0; i < a.length; i++){
            if(!arr1.containsKey(a[i])){
                arr1.put(a[i], 1);
            } else {
                arr1.put(a[i], arr1.get(a[i]) + 1);
            }
        }
        
        for(int i = 0; i < b.length; i++){
            if(!arr1.containsKey(b[i]) || arr1.get(b[i]) == 0){
                return false;
            } else {
                arr1.put(b[i], arr1.get(b[i]) - 1);
            }
        }
      
        
        return true;
    }
}
