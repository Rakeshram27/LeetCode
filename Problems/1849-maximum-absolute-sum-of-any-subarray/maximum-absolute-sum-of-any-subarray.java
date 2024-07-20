class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0, max = 0;
        int maxsum = 0;
        for(int i : nums) {
            min = Math.min(i, min + i);
            max = Math.max(i, max + i);
            maxsum = Math.max(maxsum, Math.max(Math.abs(max), Math.abs(min)));
        }
        return maxsum;
    }
}