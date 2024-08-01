class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String str : details) {
            int age = Integer.parseInt(str.substring(str.length() - 4, str.length() - 2));
            if(age > 60) {
                ans++;
            }
        }
        return ans;
    }
}