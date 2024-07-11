class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> leftmap = new HashMap<>();
        Map<Integer, Integer> rightmap = new HashMap<>();
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                dq.push(i);
            }
            else if(s.charAt(i) == ')') {
                int k = dq.pop();
                leftmap.put(k,i);
                rightmap.put(i,k);
            }
        }
        //System.out.print(rightmap);
        //System.out.print(leftmap);
        int i = 0;
        int dir = 1;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(ch != '(' && ch != ')') sb.append(ch);
            else {
                if(ch == ')') {
                    i = rightmap.get(i);
                }
                else if(ch == '(') {
                    i = leftmap.get(i);
                }
                dir = -dir;
            }
            i += dir;
        }
        return sb.toString();
    }
}