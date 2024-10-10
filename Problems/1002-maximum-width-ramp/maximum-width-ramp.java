class Solution {
    public int maxWidthRamp(int[] nums) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i < nums.length;i++) {
            if(dq.isEmpty() || nums[dq.peek()] > nums[i]) {
                dq.push(i);
            }
        }
        int max = 0;
        for(int i = nums.length - 1;i >= 0;i--) {
            while(!dq.isEmpty() && nums[dq.peek()] <= nums[i]) {
                int idx = dq.pop();
                max = Math.max(max, i - idx);
            }
            //if(dq.isEmpty()) break;
        }
        return max;
    }
}