import java.util.ArrayList;

// or
// import java.util.*;
public class Operation {
   public static void main(String[] args) {

      // ArrayList is a part of java collection farame worke
      // in c++ we have vectors, ArrayList is simeler to that

      ArrayList<Integer> list = new ArrayList<>();
      // ArrayList<String> list2 = new ArrayList<>();
      // ArrayList<Boolean> list3 = new ArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
       
      list.add(4,12);
      System.out.println(list);

      // size of array list

      System.out.println(list.size());

      // get element
      int element = list.get(0);
      System.out.println(element);

      // remove element
      list.remove(1);
      System.out.println(list);

      // set element at index
      list.set(2,10);
      System.out.println(list);

      //contains element check that element is in arraylist or not
       System.out.println(list.contains(3));
       System.out.println(list.contains(11));


       // print array list 
       for(int i = 0;i < list.size();i++){
         System.out.print(list.get(i)+" ");
       }
   }
}

// ------ out put -------
// [1, 2, 3, 4, 12] ( Array list )
// 5  ( size of Array list )
// 1  ( get elemnt at index 0 )
// [1, 3, 4, 12] ( removed element at index 1 ) 
// [1, 3, 10, 12] ( replace element at index 2 with 10 )
// true ( 3 is in ArrayList )
// false ( 11 is not in array list )
// 1 3 10 12 ( print arraylist as array)