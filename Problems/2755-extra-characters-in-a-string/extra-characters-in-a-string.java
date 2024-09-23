class Solution {
    Map<String, Integer> map = new HashMap<>();
    public int solve(int i, String s, int[] dp) {
        if(i >= s.length()) return 0;
        if(dp[i] != -1) return dp[i];
        int ans = Integer.MAX_VALUE;
        ans = 1 + solve(i + 1, s, dp);
        StringBuilder sb = new StringBuilder();
        for(int j = i;j < s.length();j++) {
            sb.append(s.charAt(j));
            if(map.containsKey(sb.toString())) {
                ans = Math.min(ans, solve(j + 1, s,dp));
            }
        }
        return dp[i] = ans;
    }
    public int minExtraChar(String s, String[] dictionary) {
        for(String str : dictionary) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0,s,dp);
    }
}