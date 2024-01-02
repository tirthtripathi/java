import java.util.Scanner;

public class Fibonacci {
   public static final String ANSI_RED = "	\u001B[31m";
   public static final String ANSI_YELLOW_BACKGROUND  = "\u001B[43m";
    public static void fibonacci(int n) {

        int f0 = 0, f1 = 1;

        if (n == 0) {
            System.out.println(ANSI_RED + ANSI_YELLOW_BACKGROUND +" Error ");
        } else if (n == 1) {
            System.out.println(f0);
        } else if (n == 2) {
            System.out.print(f0 + " ");
            System.out.println(f1);
        } else {
            System.out.print(f0 + " ");
            System.out.print(f1 + " ");
            for (int i = 3; i <= n; i++) {

                int f3 = f0 + f1;
                f0 = f1;
                f1 = f3;
                System.out.print(f3 + " ");
            }
        }

    }
   
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Limite of Fibonacci");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        fibonacci(n);
    }

}
