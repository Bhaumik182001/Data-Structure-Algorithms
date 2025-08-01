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
    public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;

    
    int len = 1;
    ListNode tail = head;
    while (tail.next != null) {
        tail = tail.next;
        len++;
    }

    
    k %= len;
    if (k == 0) return head;

    
    ListNode slow = head;
    ListNode fast = head;

    for (int i = 0; i < k; i++) {
        fast = fast.next;
    }

    
    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }

   
    fast.next = head;
    head = slow.next;
    slow.next = null;

    return head;
    }
}