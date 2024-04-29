class Solution {
    public int minOperations(int[] nums, int k) {
        int xorsum = 0;
        int res = 0;
        for(int n : nums){
            xorsum ^= n;
        }
        k = k ^ xorsum;
        while(k > 0){
            res += k & 1;
            k>>= 1;
        }
        return res;
    }
}