/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        while(head != null) {
            st.push(head.val);
            head = head.next;
        }
        ListNode Tail = null;
        while(!st.isEmpty() || res != 0) {
            Tail = new ListNode(0, Tail);
            if(!st.isEmpty()) {
                res += st.pop() * 2;
            }
            Tail.val = res % 10;
            res /= 10;
        }
        return Tail;
    }
}