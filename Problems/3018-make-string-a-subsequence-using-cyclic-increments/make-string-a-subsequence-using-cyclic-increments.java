class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str2.length() > str1.length()) return false;
        //int n1 = str1.length(),n2 = str2.length();
        int count = 0;
        for(int i = 0;i < str1.length() && count < str2.length();i++)
        {
            if(str1.charAt(i) == str2.charAt(count))
            {
                count++;
            }
            else if(((str1.charAt(i) - 'a') + 1) % 26 + 'a' == str2.charAt(count))
            {
                count++;
            }
        }
        return count == str2.length();
    }
}