// to find loop or cycle in Linked List
// here we can aslo see the function for removing cycle from LinkedList

public class FindLoop {
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
    public static int size;

    public void Add(int data) {

        Node newnode = new Node(data);

        size++;

        if (head == null) {
            tail = head = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // is Loop function
    public static boolean isloop() {// floy's cycle finding algo
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // loop exist
            }
        }
        return false;// loop does not exist
    }

    // remove cycle from liked list
    public static void removeLoop() {
        // detect Loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (fast == slow) {
                cycle = true; // loop exist
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Assigen Last Node's next = Null
        prev.next = null;
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isloop());
        removeLoop();
        System.out.println(isloop());
    }
}

// javac FindLoop.java
// java FindLoop