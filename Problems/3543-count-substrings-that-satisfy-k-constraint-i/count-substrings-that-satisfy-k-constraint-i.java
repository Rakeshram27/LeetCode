class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cnt = 0, n = s.length();
        int left = 0, right = 0;
        int res = 0;
        while(right < n) {
            if(s.charAt(right) == '0') {
                cnt++;
            }
            while(cnt > k && (right - left + 1 - cnt) > k) {
                if(s.charAt(left) == '0') {
                    cnt--;
                }
                left++;
            }
            res += (right - left + 1);
            right++;
        }
        return res;
    }
}