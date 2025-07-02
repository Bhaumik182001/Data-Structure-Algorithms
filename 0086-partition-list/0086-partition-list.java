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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1, head);
        ListNode temp = dummy;

     
        while (temp.next != null && temp.next.val < x) {
            temp = temp.next;
        }

        ListNode curr = temp;
     
        while (curr.next != null) {
            if (curr.next.val < x) {
                
                ListNode move = curr.next;
                curr.next = move.next;

                move.next = temp.next;
                temp.next = move;

                temp = temp.next;  
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
