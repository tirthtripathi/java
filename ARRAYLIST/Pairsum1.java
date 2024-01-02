// find if any pair in sorted arraylist has a target sum.
// [1,2,3,4,5] target sum = 5
// two pointer approach 
import java.util.*;
public class Pairsum1 {

    public static boolean pairsum(ArrayList<Integer> list,int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
 
      System.out.println(pairsum(list, 7)); 
        
}
}
// javac Pairsum1.java
// java Pairsum1