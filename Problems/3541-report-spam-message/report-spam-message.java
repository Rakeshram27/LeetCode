class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> st = new HashSet<>();
        for(String word : bannedWords) {
            st.add(word);
        }
        int cnt = 0;
        boolean flag = false;
        for(String str : message) {
            if(st.contains(str)) {
                cnt++;
                if(cnt >= 2) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}