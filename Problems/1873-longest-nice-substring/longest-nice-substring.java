class Solution {
    public String longestNiceSubstring(String s) {
        int len = s.length();
        int ans = 0, k = -1;
        for(int i = 0;i < len;i++) {
            int lower = 0, upper = 0;
            for(int j = i;j < len;j++) {
                char ch = s.charAt(j);
                if(Character.isLowerCase(ch)) {
                    lower |= 1 << (ch - 'a');
                }
                else {
                    upper |= 1 << (ch - 'A');
                }
                if(lower == upper && ans < j - i + 1) {
                    ans = j - i + 1;
                    k = i;
                }
            }            
        }
        return (k == -1) ? "" : s.substring(k, k + ans);
    }
}