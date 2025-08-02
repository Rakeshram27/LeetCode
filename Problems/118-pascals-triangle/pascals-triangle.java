class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            r.add(0,1);
            for(int j = 1;j < r.size() - 1;j++){
                r.set(j,r.get(j) + r.get(j + 1));
            }
            rows.add(new ArrayList<Integer> (r));
        }
        return rows;
    }
}