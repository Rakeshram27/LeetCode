class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt = 0;
        int xor = start ^ goal;
        while(xor != 0) {
            xor &= (xor - 1);
            cnt++;
        }
        return cnt;
    }
}