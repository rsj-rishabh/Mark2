class MyLinkedList {
    Node head;
    int size;
    
    static class Node {
        Node next;
        int value;
        
        Node(int x){
            next = null;
            value = x;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index<0 || index>=size){
            return -1;
        }
        Node current = head;
        while(index != 0){
            current = current.next;
            index --;
        }
        return current.value;
    }
    
    public void print(){
        for(int i=0; i<size; i++){
            System.out.println(get(i));
        }
        System.out.println("Size is : "+size);
        System.out.print("--------------------------\n");
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        //System.out.println("addAtHead");
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size += 1;
        //print();
    }
    
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //System.out.println("addAtTail");
        if (size == 0){
            addAtHead(val);
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(val);
            current.next = newNode;
            size += 1;
        }
        //print();
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        //System.out.println("addAtIndex");
        if (index == 0){
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index>0 && index<size){
            Node current = head;
            while(index != 1){
                current = current.next;
                index --;
            }
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;
            size += 1;
        }
        //print();
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        //System.out.println("deleteAtIndex");
        if (index>0 && index<size){
            Node current = head;
            Node previous = null;
            //System.out.println(current.value);
            while(index != 0){
                previous = current;
                current = current.next;
                //System.out.println(current.value);
                index --;
            }
            previous.next = current.next;
            current.next = null;
            size -= 1;
        } else if (index == 0){
            if (size > 1){
                Node current = head;
                head = head.next;
                current.next = null;
                size -= 1;
            } else if (size == 0){
                head = null;
                size -= 1;
            }
        }
        //print();
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
