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
    public int getDecimalValue(ListNode head) {
        int exp = 0;
        int ans = 0;

        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while(!st.isEmpty()){
            ans += (st.pop() * Math.pow(2, exp));
            exp++;
            System.out.println(ans);
        }

        return ans;
    }
}