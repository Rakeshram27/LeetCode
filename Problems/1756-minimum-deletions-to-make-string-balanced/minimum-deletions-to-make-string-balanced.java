class Solution {
    public int minimumDeletions(String s) {
        int ans = 0, bcount = 0;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == 'b') {
                bcount++;
            }
            else {
                ans = Math.min(ans + 1, bcount);
            }
        }
        return ans;
    }
}