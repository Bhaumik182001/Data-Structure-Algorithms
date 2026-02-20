class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> res = new ArrayList<>();
        if(arr.length == 0) return res;
        
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        max.offer(arr[0]);
        res.add((double)arr[0]);
        
        int maxSize = 0;
        int minSize = 0;
        
       for(int i = 1; i < arr.length; i++){
           if(arr[i] > max.peek()){
               min.offer(arr[i]);
           } else {
               max.offer(arr[i]);
           }
           
            maxSize = max.size();
            minSize = min.size();
           
           if(Math.abs(maxSize - minSize) >= 3){
               if(maxSize > minSize){
                   min.offer(max.poll());
               } else {
                   max.offer(min.poll());
               }
           }
           
           maxSize = max.size();
            minSize = min.size();
           
        int diff = Math.abs(maxSize - minSize);
       
       if(diff == 0){
           int a = max.peek();
           int b = min.peek();
           
           res.add((a + b) / 2.0);
            
       } else if(diff == 1) {
           if(maxSize > minSize){
               res.add((double)max.peek());
           } else {
               res.add((double)min.peek());
           }
           
       } else if(diff == 2){
           if(maxSize > minSize){
                int a = max.poll();
                int b = max.poll();
           
                res.add((a + b) / 2.0);
                
                max.offer(a);
                max.offer(b);
           } else {
                int a = min.poll();
                int b = min.poll();
           
                res.add((a + b) / 2.0);
                
                min.offer(a);
                min.offer(b);
           }
       } 
       }
       
       
        
        return res;
    }
}