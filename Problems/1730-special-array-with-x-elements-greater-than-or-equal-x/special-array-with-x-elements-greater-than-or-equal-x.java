class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n + 1];
        for(int i : nums) {
            pref[Math.min(n, i)]++;
        }
        int ans = 0;
        for(int i = n;i >= 1;i--) {
            ans += pref[i];
            if(i == ans) {
                return i;
            }
        }
        return -1;
    }
}