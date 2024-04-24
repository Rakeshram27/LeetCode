class Solution {
    public int tribonacci(int n) {
        if(n < 2) return n;
        int[] dp = {0,1,1};
        for(int i = 3;i <= n;i++) {
            int k = dp[0] + dp[1] + dp[2];
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = k; 
        }
        return dp[2];
    }
}