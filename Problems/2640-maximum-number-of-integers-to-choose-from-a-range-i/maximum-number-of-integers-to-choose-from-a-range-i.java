class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> st = new HashSet<>();
        for(int i : banned) {
            st.add(i);
        }
        int cnt = 0, sum = 0;
        for(int i = 1;i <= n;i++) {
            if(!st.contains(i)) {
                sum += i;
                if(sum <= maxSum) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}