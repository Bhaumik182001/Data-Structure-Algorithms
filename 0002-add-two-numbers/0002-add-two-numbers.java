class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        int c1 = 0;
        int c2 = 0;
        ListNode header = new ListNode(0);
        ListNode pointer = header;
        
        while(c!=0 || l1 != null || l2 != null){
            if(l1 != null) c1 = l1.val;
            else c1 = 0;

            if(l2 != null) c2 = l2.val;
            else c2 = 0;
            
           c += c1 + c2;
           pointer.next = new ListNode(c%10);
           pointer = pointer.next;
           c /= 10;

           if(l1 != null) l1 = l1.next;
           if(l2 != null) l2 = l2.next; 
        }

        return header.next;
    }
}