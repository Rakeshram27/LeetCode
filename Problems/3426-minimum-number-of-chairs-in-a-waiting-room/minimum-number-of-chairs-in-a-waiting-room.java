class Solution {
    public int minimumChairs(String s) {
        int count = 0, max = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'E') {
                count++;
                max = Math.max(max, count);
            }
            else if(ch == 'L') count--;
        }
        return max;
    }
}