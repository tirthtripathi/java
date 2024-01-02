// this program is for implementation of stack using 2 queue

import java.util.LinkedList;
import java.util.Queue;

public class Stackusing2queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // add
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // remove
        public static int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            // case 1 for q1 if data is in q1 then this case will execute
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {// this is second case for q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            // case 1 for q1 if data is in q1 then this case will execute
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {// this is second case for q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
// javac Stackusing2queue.java
// java Stackusing2queue