class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int xor = 0;
        int[] prefix_sum = new int[arr.length];
        for(int i = 0;i < arr.length;i++) {
            xor ^= arr[i];
            prefix_sum[i] = xor;
        }
        int[] res = new int[queries.length];
        for(int i = 0;i < queries.length;i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int val = 0;
            if(start == 0) {
                val = prefix_sum[end];
            }
            else {
                val = prefix_sum[end] ^ prefix_sum[start - 1];
            }
            res[i] = val;
        }
        return res;
    }
}