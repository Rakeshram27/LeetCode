class Solution {
    public int maxDistance(int[] position, int m) {
        int low = 0, high = (int)1e9 + 7;
        Arrays.sort(position);
        int res = 0;
        while(low < high) {
            int mid = low + (high- low) / 2;
            int count = 1;
            int check = position[0];
            for(int i = 1;i < position.length;i++) {
                if(position[i] - check >= mid) {
                    count++;
                    check = position[i];
                }
            }
            if(count >= m) {
                res = Math.max(res,mid);
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return res;
    }
}