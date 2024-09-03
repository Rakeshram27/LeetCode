class Solution {
    public int getLucky(String s, int k) {
        String ans = "";
        int res = 0;
        for(char ch : s.toCharArray()) {
            int curr = ch - 'a' + 1;
            ans += Integer.toString(curr);
            res += ch - 'a' + 1;
        }
        while(k-->0) {
            res = 0;
            for(char ch : ans.toCharArray()) {
                res += ch - '0';
            }
            ans = Integer.toString(res);
        }
        return res;
    }
}