public class Reverse {
     public class Node{
        int data;
        Node next;
        
        public Node(int data) {
          this.data = data;
          this.next = null;  
        }
     }
     public static Node head;
     public static Node tail;
     public static int size;
     
     public void Add(int data){
        Node newnode = new Node(data);
        size ++;
        if (head == null) {
            tail = head = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
     }

     // function to reverse the array
     public void reverse() {
        Node prev = null;
        Node curr = tail = head; // becaus after reversing head is a tail
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;    
        }
        head = prev;
     }

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
        Reverse LL = new Reverse();
        
        LL.Add(1);
        LL.Add(2);
        LL.Add(3);
        LL.Add(4);


        LL.print();
        LL.reverse();
        LL.print();
     }
}
// javac Reverse.java
// java Reverse 