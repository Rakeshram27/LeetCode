class Solution {
    public long minEnd(int n, int x) {
        long val = x;
        String str = Integer.toBinaryString(n - 1);
        int idx = 0;
        long ones = 1;
        for(int i = str.length() - 1;i >= 0;i--){
            if(str.charAt(i) == '0'){
                while((val & (ones<<idx)) != 0){
                    idx++;
                }
                idx++;
            }else{
                while((val & (ones<<idx)) != 0){
                    idx++;
                }
                val = val | (ones<<idx);
                idx++;
            }
        }
        return val;
        /*long val = x;
        while(--n > 0) {
            val = (val + 1) | x;
        }
        return val;*/
    }
}