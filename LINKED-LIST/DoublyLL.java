public class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null; 
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add First
    public void AddFirst(int data){
      Node newnode = new Node(data);
      size++;
      if(head == null){
        head=tail=newnode;
        return;
      }

      newnode.next = head;
      head.prev = newnode;
      head = newnode;
    }
    // remove First
    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int vall = head.data;
            head = null;
            tail = null;
            size --;
        }
       int val = head.data; 
       head = head.next;
       head.prev = null;
       size --;
       return val;
    }
    // reverse Linked List
     public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;

     }
    // print
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while(temp != null){
          System.out.print(temp.data+" <-> ");
          temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL  dll = new DoublyLL();
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);

        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();

    }
    
}
// javac DoublyLL.java
// java DoublyLL