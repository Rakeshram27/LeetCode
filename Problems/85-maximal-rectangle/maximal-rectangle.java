class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int[] heights = new int[n + 1];
        int max = 0;
        for (char[] row : matrix) {
            for (int i = 0; i < n; i++) {
                heights[i] = row[i] == '1' ? heights[i] + 1 : 0;
            }
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for (int i = 0; i < n + 1; i++) {
                while (st.peek() != -1 && heights[i] < heights[st.peek()]) {
                    int h = heights[st.pop()];
                    int w = i - st.peek() - 1;
                    max = Math.max(max, h * w);
                }
                st.push(i);
            }
        }
        return max; 
    }
}