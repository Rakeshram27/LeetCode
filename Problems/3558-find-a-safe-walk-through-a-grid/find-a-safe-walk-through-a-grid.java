class Solution {
    int row = 0, col = 0;
    int[][] visited;
    public boolean func(int i, int j, List<List<Integer>> grid, int health) {
        if(i < 0 || j < 0 || i >= row || j >= col || health <= 0) return false;
        if(grid.get(i).get(j) == 1) health--;
        if(i == row - 1 && j == col - 1) {
           return (health > 0);
        }
        if(visited[i][j] >= health) return false;
        visited[i][j] = health;

        boolean canReach = func(i, j + 1, grid, health) || func(i + 1, j, grid, health) || func(i, j - 1, grid, health) || func(i - 1, j, grid, health);
        //visited[i][j] = 0;
        return canReach;
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        row = grid.size();
        col = grid.get(0).size();
        visited = new int[row][col];
        return func(0, 0, grid, health);
    }
}