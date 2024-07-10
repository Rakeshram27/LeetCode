class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String str: logs) {
            if(str.equals("./")) {
                continue;
            }
            if(str.equals("../")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else {
                st.push(str);
            }
            //System.out.print(st+" ");
        }
        //System.out.print(st+" ");
        return st.size();
    }
}