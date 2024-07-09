class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] total = new int[n];
        if(s.charAt(0) == '*') total[0] = 1;
        for(int i = 1;i < n;i++) {
            if(s.charAt(i) == '*') total[i] = total[i - 1] + 1;
            else total[i] = total[i - 1];
        }
        int[] left = new int[n];
        int[] right = new int[n];
        if(s.charAt(0) == '|') left[0] = 0;
        else left[0] = -1;
        for(int i = 1;i < n;i++) {
            if(s.charAt(i) != '*') left[i] = i;
            else left[i] = left[i - 1];
        }
        if(s.charAt(n - 1) == '|') right[n - 1] = n - 1;
        else right[n - 1] = -1;
        for(int i = n - 2;i >= 0;i--) {
            if(s.charAt(i) == '|') right[i] = i;
            else right[i] = right[i + 1];
        }
        int q = queries.length;
        //int[] ans = new int[q];
        List<Integer> ans = new ArrayList<>();
        for(int[] query : queries) {
            int low = right[query[0]];
            int high = left[query[1]];
            if(low == -1 || high == -1 || low >= high) {
                ans.add(0);
                continue;
            }
            //System.out.print(low+" "+high);
            ans.add(total[high] - total[low]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}