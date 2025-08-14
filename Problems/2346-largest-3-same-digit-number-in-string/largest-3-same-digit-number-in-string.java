class Solution {
    public String largestGoodInteger(String num) {
        for(int i = 9;i >= 0;i--) {
            String triple = String.valueOf(i).repeat(3);
            if(num.contains(triple)) {
                return triple;
            }
        }
        return "";
    }
}