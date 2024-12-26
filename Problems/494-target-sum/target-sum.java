class Solution {
    private int backtrack(int[] nums,int idx,int currsum,int target) {
        if(idx == nums.length) {
            if(currsum == target) {
                return 1;
            }
            else return 0;
        }
        int left = backtrack(nums, idx + 1, currsum + nums[idx], target);
        int right = backtrack(nums, idx + 1, currsum - nums[idx], target);
        return left + right;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,0,0,target);
    }
}