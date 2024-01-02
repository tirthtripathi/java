import java.util.*;
public class Sort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(8);
        list.add(5);
        list.add(11);
        list.add(7);


        System.out.println(list);
        Collections.sort(list); // asending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); 
    }
}
