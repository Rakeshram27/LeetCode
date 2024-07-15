class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids) {
            boolean flag = true;
            while(flag && i < 0 && !st.isEmpty() && st.peek() > 0) {
                int top = st.pop();
                if(top >= -i) {
                    flag = false;
                }
                if(top > -i) {
                    st.push(top);
                }
            }
            if(flag) {
                st.push(i);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1;i >= 0;i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}