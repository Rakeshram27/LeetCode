class Solution {
    public int partitionString(String s) {
        int[] alp = new int[26];
        int par = 0, last_pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (alp[ch - 'a'] >= last_pos) {
                par++;
                last_pos = i + 1;
            }
            alp[ch - 'a'] = i + 1;
        }
        return par;
    }
}