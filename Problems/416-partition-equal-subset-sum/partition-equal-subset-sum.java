class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        if(sum % 2 != 0) return false;
        int targetsum = sum / 2;
        boolean[] curr = new boolean[targetsum + 1];
        curr[0] = true;
        for(int k : nums) {
            for(int i = targetsum;i >= k;i--) {
                curr[i] = (curr[i] || curr[i - k]);
            }
        }
        return curr[targetsum];
    }
}