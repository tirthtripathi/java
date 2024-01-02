public class Mergesort {
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);
        // left and right merge sort
        Node righthead = mid.next;
        mid.next = null;

        Node newleft = mergeSort(head); // left part
        Node newright = mergeSort(righthead); // right part
        // merge linked list

        return merge(newleft, newright);
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
        Mergesort LL = new Mergesort();
       // LL.AddLast(5);
        LL.AddLast(4);
        LL.AddLast(3);
        LL.AddLast(2);
        LL.AddLast(1);

        LL.print();
        LL.head = LL.mergeSort(LL.head);
        LL.print();
    }
}
//javac Mergesort.java
// java Mergesort