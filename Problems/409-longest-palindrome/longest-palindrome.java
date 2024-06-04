class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char ch : s.toCharArray()){
           count[ch]++;
        }
        int sum = 0;
        for(int x : count){
            sum += x/2 *2;
            if(sum % 2 == 0 && x % 2 == 1)
            sum++;
        }
        return sum;
    }
}