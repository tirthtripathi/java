import java.util.Scanner;

 public class Areaofsquare 
 {

    public static void main(String args[]) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            float side = sc.nextFloat();

            float Area = side * side;

            System.out.println("Area of Square is: "+Area);
        }

    }
}
