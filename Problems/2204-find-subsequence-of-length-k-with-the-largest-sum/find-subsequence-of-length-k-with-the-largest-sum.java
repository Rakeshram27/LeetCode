class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            pq.add(n);
            list.add(n);
        }
        while(pq.size() > k){
            list.remove(pq.poll());
        }
        int[] arr = new int[k];
        for(int i = 0;i < k;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}