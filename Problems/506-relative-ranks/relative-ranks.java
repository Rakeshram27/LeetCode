class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max = 0;
        for(int i :score) {
            max = Math.max(i, max);
        }
        int[] totalRanks = new int[max + 1];
        for(int i = 0;i < score.length;i++) {
            totalRanks[score[i]] = i + 1;
        }
        int rank = 1;
        String[] topThree = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] ans = new String[score.length];
        for(int i = max;i >= 0;i--) {
            if(totalRanks[i] != 0) {
                if(rank < 4) {
                    ans[totalRanks[i] - 1] = topThree[rank - 1];
                }
                else {
                    ans[totalRanks[i] - 1] = rank + "";
                }
                rank++;
            }
        }
        return ans;
    }
}