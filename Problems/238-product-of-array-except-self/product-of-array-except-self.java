class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre = 1, suff = 1;
        int[] gd = new int[n];
        gd[0] = 1;
        for(int i = 1;i < n;i++){
            //gd[i] = pre;
            //pre = pre * nums[i];
            gd[i] = nums[i - 1] * gd[i - 1];
        }
        for(int i = n - 1;i >= 0;i--){
            gd[i] = gd[i] * suff;
            suff = suff * nums[i];
        }
        return gd;
    }
}