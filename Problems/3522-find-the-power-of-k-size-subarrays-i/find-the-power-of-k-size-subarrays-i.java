class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int[] res = new int[nums.length + 1 - k];
        Arrays.fill(res, - 1);
        int cnt = 1;
        for(int i = 0;i < nums.length - 1;i++) {
            if(nums[i + 1] - nums[i] == 1) {
                cnt++;
            }
            else {
                cnt = 1;
            }
            if(cnt >= k) {
                res[i - k + 2] = nums[i + 1];
            }
            //System.out.print(cnt+" ");
        }
        return res;
    }
}