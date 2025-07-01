class ListNode{
    int val;
    ListNode next;

    public ListNode(){
        this.val = -1;
        this.next = null;
    }

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    ListNode head;

    public MyLinkedList() {
        this.head = null;  
    }
    
    public int get(int index) {
        ListNode temp = head;
        
        for(int i = 0; i < index && temp != null; i++){
            temp = temp.next;
        }

        return (temp != null) ? temp.val : -1;
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) { 
        if(index == 0) {
            addAtHead(val);
            return;
        }

        ListNode temp = head;

        for(int i = 0; i < index - 1 && temp != null; i++){
            temp = temp.next;
        }

        if (temp == null) return;
        ListNode newNode = new ListNode(val);

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(index == 0) {
            head = head.next;
            return;
        }

        ListNode temp = head;

        for(int i = 0; i < index - 1 && temp != null; i++){
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */