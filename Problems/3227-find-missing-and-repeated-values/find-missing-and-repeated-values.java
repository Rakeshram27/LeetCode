class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        TreeSet<Integer> set = new TreeSet<>();
        int[] a = new int[2];
        for(int i= 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(!set.add(grid[i][j])){
                    a[0] = grid[i][j];
                }
            }
        }
        for(int i = 1;i <= (int)Math.pow(grid.length,2);i++){
            if(!set.contains(i)){
                a[1] = i;
                break;
            }
        }
        return a;
    }
}