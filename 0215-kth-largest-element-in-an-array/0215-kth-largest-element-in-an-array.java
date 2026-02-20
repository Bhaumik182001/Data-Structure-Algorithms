class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : nums){
            pq.offer(num);
        }

        int count = 1;

        while(count < k){
            pq.poll();
            count++;
        }

        return pq.peek();
    }
}