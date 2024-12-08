class Solution {
    public int possibleStringCount(String word) {
        int cnt = 0;
        for(int i = 1;i < word.length();i++) {
            if(word.charAt(i) != word.charAt(i - 1)) cnt++;
        }
        return word.length() - cnt;
    }
}