class Solution {
    public int smallestNumber(int n, int t) {
        while(true) {
            if(isDivisible(n, t)) {
                return n;
            }
            n++;
        }
    }
    public boolean isDivisible(int n, int t) {
        int product = 1;
        while(n != 0) {
            product *= n % 10;
            n /= 10;
        }
        return product % t == 0;
    }
}