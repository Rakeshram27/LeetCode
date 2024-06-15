class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] cnt = new int[max + 1];
        for(int n : nums) {
            cnt[n]++;
        } 
        int res = 0;
        for(int i = 0;i < cnt.length - 1;i++) {
            if(cnt[i] <= 1) continue;
            int k = cnt[i] - 1;
            cnt[i + 1] += k;
            res += k;
        }
        int last = cnt.length - 1;
        if(cnt[last] > 1) {
            int k = cnt[last] - 1;
            res += k * (1 + k) / 2;
        }
        return res;
    }
}

// TC : O (n + max) 
// SC : O (max)
