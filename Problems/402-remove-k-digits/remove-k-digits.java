class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        if(k >= n) return "0";
        for(char ch : num.toCharArray()) {
            while(!st.isEmpty() && k > 0 && ch < st.peek()) {
                st.pop();
                k--;
            }
            if(!st.isEmpty() || ch != '0') {
                st.push(ch);
            }
        }
        while(!st.isEmpty() && k-- > 0) {
            st.pop();
        }
        if(st.isEmpty()) return "0";
        String res = "";
        while(!st.isEmpty()) {
            res = st.peek() + res;
            st.pop();
        }
        return res
        ;
    }
}