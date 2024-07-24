class Solution {
    public int[] sortJumbled(int[] mapping, int[] given) {
        int n = given.length;
        int[][] ans = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            ans[i][0] = given[i];
            String str = Integer.toString(given[i]);
            for(int j = 0 ; j < str.length() ; j++){
                ans[i][1] = ans[i][1] * 10 + mapping[str.charAt(j) - '0'];
            }
        }
        Arrays.sort(ans, (a, b) -> a[1] - b[1]);
        for(int i = 0 ; i < n ; i++){
            given[i] = ans[i][0];
        }
        return given;
    }
}