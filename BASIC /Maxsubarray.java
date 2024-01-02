import java.util.Scanner;

public class Maxsubarray {

    public static void maxsubarray(int number[]) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += number[k];
                    if (curr_sum > max_sum) {
                        max_sum = curr_sum;
                    }
                }
            }
        }
        System.out.println("MAX SUM :" + max_sum);
    }

    public static void main(String[] args) {
        System.out.println("enter the number of element");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int number[] = new int[n];
              for(int i=0;i<n;i++)
              {
                System.out.println("Enter "+ i +" element:");
                 number [i] = sc.nextInt();
              }
            maxsubarray(number);
        }
    }

}
