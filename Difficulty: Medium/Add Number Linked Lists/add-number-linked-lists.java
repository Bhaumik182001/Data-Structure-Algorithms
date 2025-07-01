/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node num){
        Node p = null;
        Node q = num;
        
        while(q != null){
            Node r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        
        return p;
    }
    
    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        
        Node p = num1;
        Node q = num2;
        Node r = new Node(-1);
        Node temp = r;
        
        int carry = 0;
        
        while(p != null || q != null || carry != 0){
            int sum = 0;
            
            if(p != null){
                sum += p.data;
                p = p.next;
            }
            
            if(q != null){
                sum += q.data;
                q = q.next;
            }
            
            sum += carry;
            
            Node newNode = new Node(sum % 10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
            
        }
         
        r = reverse(r.next);
        
        while(r != null && r.next != null && r.data == 0){
            r = r.next;
        }
        
        return r;
        
    }
}