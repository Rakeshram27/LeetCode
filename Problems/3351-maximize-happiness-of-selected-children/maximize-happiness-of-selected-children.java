class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int i = n - 1;
        long sum = 0;
        int j = 0;
        while(k-->0) {
            if((happiness[i] - j) > 0) {
                sum += happiness[i] - j;
            }
            i--;
            j++;
        }
        return sum;
    }
}