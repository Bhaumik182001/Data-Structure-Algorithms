class Solution {
    public int maximumSum(int[] nums) {
        PriorityQueue<Integer> pq0 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            if(num % 3 == 0){
                pq0.offer(num);
            } else if(num % 3 == 1) {
                pq1.offer(num);
            } else {
                pq2.offer(num);
            }
        }

        int max = 0;

        if(pq0.size() >= 3){
            int a = pq0.poll();
            int b = pq0.poll();
            int c = pq0.poll();

            int sum = a + b + c;

            if(sum % 3 == 0) max = Math.max(max, sum);
            pq0.offer(a);
            pq0.offer(b);
            pq0.offer(c);
        }

        if(pq1.size() >= 3){
            int a = pq1.poll();
            int b = pq1.poll();
            int c = pq1.poll();

            int sum = a + b + c;

            if(sum % 3 == 0) max = Math.max(max, sum);
            pq1.offer(a);
            pq1.offer(b);
            pq1.offer(c);
        }

        if(pq2.size() >= 3){
            int a = pq2.poll();
            int b = pq2.poll();
            int c = pq2.poll();
            int sum = a + b + c;

            if(sum % 3 == 0) max = Math.max(max, sum);
            pq2.offer(a);
            pq2.offer(b);
            pq2.offer(c);
        }

        if(pq0.size() > 0 && pq1.size() > 0){
            int a = pq0.poll();
            int b = pq1.poll();

            int sum = a + b;

            if(sum % 3 == 0) max = Math.max(max, sum);
            pq0.offer(a);
            pq1.offer(b);
        }

        if(pq0.size() > 0 && pq1.size() > 0 && pq2.size() > 0){
            int a = pq0.peek();
            pq0.poll();
            int b = pq1.peek();
            pq1.poll();
            int c = pq2.peek();
            pq2.poll();

            int sum = a + b + c;

            if(sum % 3 == 0) max = Math.max(max, sum);
            pq0.offer(a);
            pq1.offer(b);
            pq2.offer(c);
        }



        return max;
    }
}