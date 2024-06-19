class Solution {
    public boolean ConsectivePicks(int mid, int[] nums,int m,int k) {
        int bloomcount = 0, count = 0;
        for(int i : nums) {
            if(mid >= i) {
                count++;
            }
            else {
                bloomcount += (count / k);
                count = 0;
            }
        }
        bloomcount += (count / k);
        return bloomcount >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long res = (long)m * k;
        if(res > bloomDay.length) return -1;
        int low = 0, high = 0;
        for(int i : bloomDay) {
            low = Math.min(low, i);
            high = Math.max(high,i);
        }
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(ConsectivePicks(mid, bloomDay,m,k)) high = mid;
            else low = mid + 1;
        } //Here the both (low and high) pointing to same value, so we can return any of them either low or high
        return high; 
    }
}