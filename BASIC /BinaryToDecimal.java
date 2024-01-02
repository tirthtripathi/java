import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String binaryString = sc.next();
            int decimal = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '1') {
                    decimal += Math.pow(2, binaryString.length() - 1 - i);
                }
            }
            System.out.println("Decimal: " + decimal);
        }
    }
}
