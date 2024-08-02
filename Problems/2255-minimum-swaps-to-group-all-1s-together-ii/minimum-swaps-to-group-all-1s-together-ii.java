class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, onescount = 0;
        for(int i : nums) {
            onescount += i;
        }
        int[] sum = new int[(n << 1) + 1];
        for(int i = 0;i < (n << 1);i++) {
            sum[i + 1] = sum[i] + nums[i % n];
        }
        int max = 0;
        for(int i = 0;i < (n << 1);i++) {
            int k = i + onescount - 1;
            if(k < (n << 1)) {
                max = Math.max(max, sum[k + 1] - sum[i]);
            }
            //System.out.print(max+" "+k);
        }
        return onescount - max;
    }
}