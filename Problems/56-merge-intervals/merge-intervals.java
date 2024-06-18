class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0] - b[0];
        });
        List<int[]> ans = new ArrayList<>();
        for(int[] interval : intervals) {
            if(ans.size() == 0) {
                ans.add(interval);
            }
            else {
                int[] last = ans.get(ans.size() - 1);
                if(interval[0] > last[1]) {
                    ans.add(interval);
                }
                else {
                    last[1] = Math.max(last[1], interval[1]);
                }
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}