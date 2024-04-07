class Solution {
    public boolean checkValidString(String s) {
        // Stack<Character> stack = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     if(ch == ')') stack.push(ch);
        // }
        int low = 0, high = 0;
        int n = s.length();
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '('){
                low++;
                high++;
            }
            else if(s.charAt(i) == ')'){
                if(low > 0){
                    low--;
                }
                high--;
            }
            else{
                if(low > 0)
                low--;
                high++;
            }
            if(high < 0) return false;
        }
        return low == 0;
    }
}