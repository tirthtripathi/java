import java.util.*;

public class Sum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float sum = a + b;
            float mul = a*b;
            float div =a/b;
            float sub = a-b;

            System.out.println(sum);
            System.out.println(mul);
            System.out.println(div);
            System.out.println(sub);
        }

    }
}
