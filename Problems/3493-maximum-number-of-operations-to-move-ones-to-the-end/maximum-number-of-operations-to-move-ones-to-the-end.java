class Solution {
    public int maxOperations(String s) {
        int res = 0, curr = 0;
        int n = s.length();
        for(int i = 0; i < n;i++){
            if(s.charAt(i) == '1' && i > 0 && s.charAt(i - 1) == '0'){
                res += curr;
            }
            curr += (s.charAt(i) - '0');
           // System.out.print(curr+" ");
        }
        if(s.charAt(n - 1) == '0'){
            res += curr;
        }
        return res;
    }
}