class Solution {
    public int minSwaps(String s) {
        int cnt = 0;
        for(char ch : s.toCharArray()) {
            cnt += (ch == '[') ? 1 : (ch == ']' && cnt > 0) ? -1 : 0;
        }
        return (cnt + 1) / 2;
    }
}