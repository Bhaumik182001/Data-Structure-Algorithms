class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode r = new ListNode();
        ListNode temp = r;

        while(p != null && q != null){
            int sum = p.val + q.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            p = p.next;
            q = q.next;
        }

        while(p != null){
            int sum =p.val + carry;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            temp.next = newNode;
            temp = temp.next;
            p = p.next;
        }

        while(q != null){
            int sum = q.val + carry;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            temp.next = newNode;
            temp = temp.next;
            q = q.next;
        }

        while(carry != 0){
            ListNode newNode = new ListNode(carry % 10);
            temp.next = newNode;
            temp = temp.next;
            carry /= 10;
        }

        return r.next;
    }
}