class Solution {
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]> ans = new ArrayList<>();
        int cnt = 1, k = 0;
        int r = rStart, c = cStart;
        ans.add(new int[]{r, c});
        while (ans.size() < rows * cols) {
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < cnt; ++j) {
                    r += dir[k][0];
                    c += dir[k][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        ans.add(new int[]{r, c});
                    }
                }
                k = (k + 1) % 4;
            }
            ++cnt;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}