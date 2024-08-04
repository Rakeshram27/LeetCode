class Solution {
    static int mod = (int)1e9 + 7;
    public int rangeSum(int[] nums, int n, int left, int right) {
        int totalsize = n * (n + 1) / 2;
        int[] res = new int[totalsize];
        int idx = 0;
        for(int i = 0;i < n;i++) {
            int sum = 0;
            for(int j = i;j < n;j++) {
                sum += nums[j];
                res[idx++] = sum;
            }
        }
        Arrays.sort(res);
        int ans = 0;
        for(int i = left - 1;i < right;i++) {
            ans = (ans + res[i]) % mod;
        }
        return ans;
    }
}