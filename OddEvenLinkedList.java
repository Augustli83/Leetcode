/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = new ListNode(0);
        ListNode oddCurr = odd;
        ListNode even = new ListNode(0);
        ListNode evenCurr = even;
        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            i++;
            if (i % 2 == 1) {
                oddCurr.next = new ListNode(tmp.val);
                oddCurr = oddCurr.next;
            } 
            if(i % 2 == 0){
                evenCurr.next = new ListNode(tmp.val);
                evenCurr = evenCurr.next;
            }
            tmp = tmp.next;
        }
        oddCurr.next = even.next;
        return odd.next;
    }
}