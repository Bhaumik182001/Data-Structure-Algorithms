/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node fast = head;
        Node slow = head;
        int count = 0;
        
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do{
                    count++;
                    slow = slow.next;
                } while(fast != slow);
                
                return count;
            }
        }
        
        return count;
    }
}