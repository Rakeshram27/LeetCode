class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char ans = '0';
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                ans = ch;
                break;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return ans;
    }
}