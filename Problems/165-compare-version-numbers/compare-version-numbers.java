class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(), len2 = version2.length();
        for (int i = 0, j = 0; (i < len1) || (j < len2); ++i, ++j) {
            int chunk1 = 0, chunk2 = 0; 
            while (i < len1 && version1.charAt(i) != '.') {
                chunk1 = chunk1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < len2 && version2.charAt(j) != '.') {
                chunk2 = chunk2 * 10 + (version2.charAt(j) - '0');
                j++; 
            }
            if (chunk1 != chunk2) {
                return chunk1 < chunk2 ? -1 : 1;
            }
        }
        return 0;
    }
}