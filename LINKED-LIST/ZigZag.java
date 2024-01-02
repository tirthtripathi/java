public class ZigZag {
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
    // ZigZag
    public void zigzag() {
        // Find mid
         Node slow = head;
         Node fast = head.next;

         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
         }
         Node mid = slow;
        //reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR; 
        //alt merge - zigzag
       while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
       }
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
        ZigZag ll = new ZigZag();

        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);

       ll.print();
       ll.zigzag();
       ll.print();
        // 1->2->3->4->5

    }
}
// javac ZigZag.java
// java ZigZag