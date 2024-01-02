
// find if any pair in a sorted and rotated ArrayList 
import java.util.*;

public class Pairsum2 {

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int breakpoint = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakpoint = i;
                break;
            }
        }
        int lp = breakpoint + 1;
        int rp = breakpoint;
        int n = list.size();
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // [11,15,6,7,8,9,10]
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
       
        System.out.println(pairsum(list, 16));
    }
}
// javac Pairsum2.java
// java Pairsum2 