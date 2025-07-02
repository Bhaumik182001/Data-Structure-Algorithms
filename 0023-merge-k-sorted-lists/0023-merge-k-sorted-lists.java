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
    ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(l1 == null) temp.next = l2;
        if(l2 == null) temp.next = l1;

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans  = null;

        for(int i = 0; i < lists.length; i++){
            ans = merge(ans, lists[i]);
        }

        return ans;
    }
}