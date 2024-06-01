class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1;i < s.length();i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i - 1);
            int diff = Math.abs((int)ch1 - (int)ch2);
            sum += diff;
        }
        return sum;
    }
}