public class LinkedList {
   public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    // add elemnt on front
    public void AddFirst(int data) {
        // step 1 - create new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2 - newNode.next = head
        newnode.next = head;
        // step 3 - head = newnode
        head = newnode;
    }

    // add element on last
    public void AddLast(int data) {
        // step 1 - create new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newnode;
            return;
        }
        // step 2 - assigne next of tail to new node

        tail.next = newnode;

        // step 3 - assigne tail = newnode;

        tail = newnode;

    }

    // add element in middle on any liked list
    public void add(int index, int data) {
        if (index == 0) {
            AddFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        // i=index-1 temp -> prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // remove element form front of linked list 
    public int RemoveFront(){
        if( size == 0){
            System.out.println("linked list is empty ");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }

       int val = head.data;
       head = head.next;
       size--;
       return val;
    }

 // remove element form front of linked list 
 public int RemoveEnd(){
     if(size == 0){
        System.out.println("linked list is empty");
        return Integer.MIN_VALUE;
     }
     else if(size == 1){
        int val = head.data;
        head = tail = null;
        return val;
     }
     
     // previous node =  size - 2
     Node prev = head;
     for(int i =0;i<size-2;i++){
        prev = prev.next;
     }
     int val = prev.next.data;
     prev.next = null;
     tail = prev;
     size --;
     return val;
 }

    // print linked list
    public void print() { // O(n)
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // add first
        ll.AddFirst(2);
        ll.AddFirst(1);

        // add last
        ll.AddLast(3);
        ll.AddLast(4);

        ll.add(2, 9);

        // print linked list
        ll.print();
        System.out.println("Size of linked list : "+ll.size);
        
        // remove form front 
       System.out.println("Removed element from front " + ll.RemoveFront());
        ll.print();
        System.out.println("Removed element from last "+ll.RemoveEnd());
        ll.print();
        System.out.println("Size of linked list : "+ll.size);
    }
}
// javac LinkedList.java
// java LinkedList