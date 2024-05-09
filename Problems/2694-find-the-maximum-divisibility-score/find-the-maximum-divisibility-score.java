class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int temp = 0;
        int min = Integer.MAX_VALUE;
        for(int i = divisors.length - 1;i >= 0;i--) {
            int div = divisors[i];
            int count = 0;
            for(int j = 0;j < nums.length;j++) {
                if(nums[j] % div == 0) {
                    count++;
                }
            }
            if(count == temp) {
                min = Math.min(min, div);
            }
            if(count  > temp) {
                temp = count;
                min = div;
            }
        }
        return min;
    }
}