class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s,0,new ArrayList<>());
        return res;
    }
    private void backtrack(String s, int idx, List<String> list) {
        if(idx >= s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;idx + i < s.length();i++) {
            if(ispalindrome(s,idx,idx + i)) {
                list.add(s.substring(idx, idx + i + 1));
                backtrack(s, idx + i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
    private boolean ispalindrome(String s, int start, int end) {
        while(start <=  end) {
           // System.out.println(start + " " + end);
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}