class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        Set<Character> st = new HashSet<>();
        for(char ch : allowed.toCharArray()) {
            st.add(ch);
        }
        for(String str : words) {
            for(char ch : str.toCharArray()) {
                if(!st.contains(ch)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}