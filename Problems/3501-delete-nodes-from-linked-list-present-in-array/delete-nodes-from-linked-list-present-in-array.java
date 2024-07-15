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
    public ListNode modifiedList(int[] nums, ListNode head) {
         ListNode dummy = new ListNode(-1);  
        ListNode prev = dummy;  
        dummy.next = head;  
        
        HashSet<Integer> set = new HashSet<>();  
        for (int num : nums) {  
            set.add(num);  
        }  
        
        while (prev.next != null) {  
            if (set.contains(prev.next.val)) {  
                prev.next = prev.next.next;  
            } else {  
                prev = prev.next;  
            }  
        }  
        
        return dummy.next; 
        // Set<Integer> st = new HashSet<>();
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode prev = dummy;
        // ListNode curr = head;
        // for(int n : nums) {
        //     st.add(n);
        // }
        // while(curr != null) {
        //     if(st.contains(curr.val)) {
        //         prev.next = curr.next;
        //     }
        //     else {
        //         prev = curr;
        //     }
        //     curr = curr.next;
        // }
        // prev.next = null;
        // return dummy.next;
        // ListNode s = new ListNode(0);
        // s.next = head;
        // ListNode curr = s;
        // int i = 0;
        // while(curr.next != null) {
        //     if(nums[i] == curr.next.val) {
        //         curr.next = curr.next.next;
        //     }
        //     else {
        //         curr = curr.next;
        //     }
        //     i++;
        //     if(i >= nums.length) break;
        // }
        // return s.next;
    }
}