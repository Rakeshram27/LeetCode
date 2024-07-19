class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> st = new HashSet<>();
        for(int[] mat: matrix) {
            int min = Arrays.stream(mat).min().getAsInt();
            st.add(min);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < matrix[0].length;i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0;j < matrix.length;j++) {
                int k = matrix[j][i];
                max = Math.max(k, max);
            }
            if(st.contains(max)) {
                ans.add(max);
            }
        }
        return ans;
    }
}