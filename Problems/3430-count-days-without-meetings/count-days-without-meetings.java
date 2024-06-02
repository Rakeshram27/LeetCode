class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int ans = 0, max = 0;
        for(int[] a : meetings) {
            int left = a[0], right = a[1];
            if(max < left) ans += (left - max - 1);
            max = Math.max(max, right); 
        }
        ans += (days - max);
        return ans;
        /*Set<Integer> st = new TreeSet<>();
        for(int[] a : meetings) {
            for(int i = a[0];i <= a[1];i++) {
                st.add(i);
            }
        }
        return days - st.size();*/
    }
}