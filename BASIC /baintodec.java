import java.util.*;

public class baintodec {
    public static void main(String args[]) {
        int a1[] = new int[8];
        int d = 0;
        int ans = 0;
        System.out.println("Enter the binary code");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i=0;i<8;i++)
            {
                a1[i]=sc.nextInt();
            }
        }

        for (int i = 8; i >= 0; i--) {
            if (a1[i] == 1) {

                d = ans + d;
            } else {
                continue;
            }
        }

    }
}
