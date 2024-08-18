class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int idx2 = 0, idx3 = 0,idx5 = 0;
        int fact2 = 2, fact3 = 3, fact5 = 5;
        for(int i = 1;i < n;i++) {
            int min = Math.min(fact2,Math.min(fact3,fact5));
            dp[i] = min;
            if(fact2 == min) fact2 = 2 * dp[++idx2];
            if(fact3 == min) fact3 = 3 * dp[++idx3];
            if(fact5 == min) fact5 = 5 * dp[++idx5];
        }
        return dp[n - 1];
    }
}