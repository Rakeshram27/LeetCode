class Solution {
    public String findLatestTime(String s) {
        for(int i = 11;i >= 0;i--) {
            otuer: // allows the program to skip the rest of the current iteration
            for(int j = 59;j >= 0;j--) {
                String ft = String.format("%02d:%02d",i,j);
                for(int k = 0;k < 5;k++) {
                    if(s.charAt(k) == '?') continue;
                    if(ft.charAt(k) != s.charAt(k)) continue otuer;
                }
                return ft;
            }
        }
        return "";
    }
}