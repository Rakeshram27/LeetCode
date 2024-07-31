class Solution {
    static int[] directions = {1, 0, -1, 0, 1};
    public int orangesRotting(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        Deque<int[]> dq = new LinkedList<>();
        int freshcount = 0;
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < col;j++) {
                if(grid[i][j] == 2) {
                    dq.offer(new int[] {i, j});
                }
                else if(grid[i][j] == 1) {
                    freshcount++;
                }
            }
        }
        int elapsed = 0;
        while(!dq.isEmpty() && freshcount > 0) {
            elapsed++;
            for(int i = dq.size();i > 0;i--) {
                int[] calc = dq.poll();
                for(int j = 0;j < 4;j++) {
                    int x = directions[j] + calc[0];
                    int y = directions[j + 1] + calc[1];
                    if(x < row && y < col && x >= 0 && y >= 0 && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        freshcount--;
                        dq.offer(new int[] {x, y});
                       // System.out.print(grid[x][y]+" ");
                    }
                }
            }
        }
        return freshcount > 0 ? -1 : elapsed; 
    }
}