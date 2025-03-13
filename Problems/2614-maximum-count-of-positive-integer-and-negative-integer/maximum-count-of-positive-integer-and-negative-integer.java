class Solution {
    public int maximumCount(int[] nums) {
        int pos_count = 0, neg_count = 0;
        for(int i : nums) {
            if(i < 0) neg_count++;
            if(i > 0) pos_count++;
        }
        return Math.max(pos_count, neg_count);
    }
}