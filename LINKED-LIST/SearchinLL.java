 public class SearchinLL {
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
        tail.next = newnode;
        tail = newnode;

    }

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
   // iterative search
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    // recursive search 
    public int helper(Node head, int key) {
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
         return index+1;
    }
    public int recursiveSearch(int key){
       return helper(head,key);
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
        SearchinLL ll = new SearchinLL();

        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);

        ll.print();
         
       System.out.println("Your element is on index : "+ll.iterativeSearch(3));
       System.out.println("Your element is on index : "+ll.recursiveSearch(10));

    }
}
// javac SearchinLL.java
// java SearchinLL