import java.util.*;
public class Input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name:");
    String helloString = new String();
     helloString = sc.nextLine();
    System.out.println(helloString);
    }
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Input {
//     public static void main(String[] args) throws IOException {
//         System.out.println("Enter a number:"); 
//         InputStreamReader in = new InputStreamReader(System.in);
//         BufferedReader bf = new BufferedReader(in);

//         int num = Integer.parseInt(bf.readLine());
//         System.out.println("You entered: " + num);
//     }
// }