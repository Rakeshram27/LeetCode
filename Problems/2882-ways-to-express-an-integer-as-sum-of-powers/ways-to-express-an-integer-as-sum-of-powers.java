class Solution {
    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 1;
        for(int i = 1;i <= n;i++) {
            long pow = (long) Math.pow(i, x);
            for(int j = 0;j <= n;j++) {
                dp[i][j] = dp[i - 1][j];
                if(pow <= j) {
                    dp[i][j] = ((dp[i][j] + dp[i - 1][j - (int)pow]) % 1000000007);
                }
            }
        }
        return dp[n][n];
    }
}