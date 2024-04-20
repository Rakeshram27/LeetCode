class Solution {
    private int[] findLB(int[][] land, int x, int y) {
        int i = x;
        int j = y;
        for (;i < land.length && land[i][y] == 1;i++) {
            for (j = y;j < land[0].length && land[i][j] == 1;j++) {
                land[i][j] = 0;
            }
        }
        return new int[]{x, y, i - 1, j - 1};
    }
    public int[][] findFarmland(int[][] land) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0;i < land.length;i++) {
            for (int j = 0;j < land[i].length;j++) {
                if (land[i][j] == 1) {
                    int[] k = findLB(land, i, j); // k - landcoordinates
                    ans.add(k);
                }
            }
        }
    return ans.toArray(new int[0][]);
    }
}