class Solution {
    public int findComplement(int num) {
        int n = num, flip = 1;
        while(n != 0) {
            num ^= flip;
            flip <<= 1;
            n >>= 1;
        }
        return num;
    }
}