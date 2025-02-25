class Solution {
    static final int mod = 1_000_000_007;
    public int numOfSubarrays(int[] arr) {
        int oddcount = 0, evencount = 1;
        int res = 0, prefix = 0;
        for(int i : arr) {
            prefix += i;
            if(prefix % 2 == 0) {
                res += oddcount;
                evencount++;
            }
            else {
                res += evencount;
                oddcount++;
            }
            res %= mod;
        }
        return res;
    }
}