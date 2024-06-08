class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length, count = 0;
        int max = 0;
        for(int i = 1;i < n && count < k;i++) {
            if(skills[i] < skills[max]) {
                count++;
            }
            else {
                count = 1;
                max = i;
            }
        }
        return max;
    }
}