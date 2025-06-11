class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] arr = new int[len1 + len2];
        for(int i = len1 - 1;i >= 0;i--) {
            for(int j = len2 - 1;j >= 0;j--) {
                int k1 = i + j, k2 = i + j + 1;
                int prod = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = prod + arr[k2];
                arr[k1] += sum / 10;
                arr[k2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            if(!(sb.length() == 0 && i == 0)) sb.append(i);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}