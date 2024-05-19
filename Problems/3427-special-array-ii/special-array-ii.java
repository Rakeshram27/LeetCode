class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length];
        for(int i = 1;i < nums.length;i++) {
            arr[i] = arr[i - 1];
            if((nums[i] & 1) == (nums[i - 1] & 1)) arr[i]++;
        }
        boolean[] ans = new boolean[queries.length];
        for(int i = 0;i < queries.length;i++) {
            if(arr[queries[i][1]] == arr[queries[i][0]]) ans[i] = true;
        }
        return ans;
    }
}