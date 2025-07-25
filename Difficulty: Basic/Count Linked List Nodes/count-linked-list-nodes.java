/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node curr = head;
        int count = 0;
        
        while(curr != null){
            count++;
            curr = curr.next;
        }
        
        return count;
    }
}