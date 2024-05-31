class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums) {
            xor ^= i;
        } 
        int rightbit = xor & -xor;
        int firstNumber = 0;
        for(int i : nums) {
            if((i & rightbit) != 0) {
                firstNumber ^= i;
            }
        }
        int secondNumber = xor ^ firstNumber;
        return new int[] {firstNumber, secondNumber};
    }
}