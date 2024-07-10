class Solution {
    List<String> list;
    public List<String> validStrings(int n) {
        list = new ArrayList<>();
        backtrack(n, 1, new StringBuilder());
        return list;
    }
    public void backtrack(int n, int val, StringBuilder sb) {
        if(n == 0) {
            list.add(sb.toString());
        } 
        else {
            if(val != 0) {
                backtrack(n - 1,0 ,sb.append('0'));
                sb.deleteCharAt(sb.length() - 1);
            }
            backtrack(n - 1, 1 , sb.append('1'));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}