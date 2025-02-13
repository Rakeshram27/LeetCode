class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long n : nums) {
            pq.offer(n);
        }
        int op = 0;
        while(!pq.isEmpty() && pq.peek() < k) {
            if(pq.size() == 1) return -1;
            long x = pq.poll();
            long y = pq.poll();
            long res = Math.min(x,y) * 2 + Math.max(x,y);
            pq.offer(res);
            op++;
        }
        return op;
    }
}