class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0 ; i < grid.length ; i++){
            //int count = 0;
            for(int j = 0; j < grid[0].length ; j++){
                int count = 0;
                if(grid[i][j] == 1){
                    if(i + 1 < grid.length && grid[i + 1][j] == 1){
                        count++;
                    }
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){
                        count++;
                    }
                    if(j + 1 < grid[0].length && grid[i][j + 1] == 1){
                        count++;
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] == 1){
                        count++;
                    }
                    perimeter += (4 - count);
                }
            }
        }
        return perimeter; 
    }
}