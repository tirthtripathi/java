import java.util.*;
public class Primenumber {
     public static void main(String[] args) {
        
     {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The Number");
            int n = sc.nextInt();

            boolean num = true;

            for (int i = 2; i < Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    num = false;
                }
            }
            if (num == false) {
                System.out.println("Number is Not Prime");
            } else {
                System.out.println("Number is Prime");
            }
        }
    }
}
    

}