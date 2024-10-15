class Solution {
    public long minimumSteps(String s) {
        /*int i = 0, j = s.length() - 1;
        long sum = 0;
        while(i < j){
            if(s.charAt(i) == '0') i++;
            else if(s.charAt(j) == '1') j--;
            else{
                sum += (j - i);
                i++;
                j--;
            }
        }
        return sum;*/
        int zeroscount = 0;
        long sum = 0;
        char[] ch = s.toCharArray();
        for(int i = ch.length - 1;i >= 0;i--){
            if(ch[i] == '1') {
                sum += zeroscount;
            }
            else{
                zeroscount++;
            }
        }
        return sum;
    }
}