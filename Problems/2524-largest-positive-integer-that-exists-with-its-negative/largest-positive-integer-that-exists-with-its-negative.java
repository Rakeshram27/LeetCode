class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1;i >= 0;i--) {
            if(nums[i] > 0) {
                int k = nums[i] * -1;
                if(Arrays.binarySearch(nums, k) >= 0) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}