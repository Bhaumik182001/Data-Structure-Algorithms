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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode temp;

        while(curr != null && curr.next != null){
            temp = curr.next;
            int num = curr.val;
            curr.val = temp.val;
            temp.val = num;

            curr = curr.next.next;
        }

        return head;
    }
}