class Solution {
    public boolean hasSameDigits(String s) {
        int sum = 0;
        while(s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for(int i = 1;i < s.length();i++) {
                sum = (s.charAt(i - 1) - '0') + (s.charAt(i) - '0');
                sb.append(sum % 10);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}