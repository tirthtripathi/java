// find next greater element in array 
import java.util.*;
public class Nextgreater {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack <Integer> s = new Stack<>();
        int Nextgreater[] = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){
            // 1 while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            // if we use only s.peek it will give index only but we have to compair element for that arr[s.peek()]is needed
            
                s.pop();
            }
            // 2 if condition
            if(s.isEmpty()){
                Nextgreater[i] = -1;
            }else{
                Nextgreater[i] = arr[s.peek()];
            }
            // 3 push in s 
            s.push(i);
        }

        for(int i=0;i<Nextgreater.length;i++){
            System.out.print(Nextgreater[i]+" ");
        }
    }
}
// javac Nextgreater.java
// java Nextgreater
