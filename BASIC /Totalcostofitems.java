import java.util.*;

public class  Totalcostofitems {
    
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the price of pen:");
            int pen = sc.nextInt();

            System.out.println("Enter the price of pencil:");
            int pencil = sc.nextInt();

            System.out.println("Enter the price of eraser:");
            int eraser = sc.nextInt();

            float price = pen + pencil + eraser;
            float gst = (18 * price)/100;

            float total = price + gst;

            System.out.println("Total price is: "+total);
        }
    }
}
