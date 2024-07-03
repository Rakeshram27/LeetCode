class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        if(n < 5) return 0;
        Arrays.sort(nums);
        for(int i = 0;i < 4;i++) {
            min = Math.min(min, nums[n - 4 + i] - nums[i]);
        }
        return min;
    }
}