class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i : chalk) {
            sum += i;
        }
        long chalkpiece = k % sum;
        for(int i = 0;i < chalk.length;i++) {
            chalkpiece -= chalk[i];
            if(chalkpiece < 0) {
                return i;
            }
        }
        return -1;
    }
}