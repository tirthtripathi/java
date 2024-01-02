import java.util.Scanner;

class matrix {
    int data[][];
    public int n1, n2;

    matrix() {
        System.out.println("Enter the number of rows and columns:");
        try (Scanner se = new Scanner(System.in)) {
            n1 = se.nextInt();
            n2 = se.nextInt();
        }
        data = new int[n1][n2];

    }

    void getdata() {

        System.out.println("Enter the elemnets");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                try (Scanner s1 = new Scanner(System.in)) {
                    data[n1][n2] = s1.nextInt();
                }
            }
        }
    }

    matrix addmatrix(matrix m2) {
        matrix temp = new matrix();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                temp.data[n1][n2] = this.data[n1][n2] + m2.data[n1][n2];
            }
        }
        return temp;
    }

    void display() {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.println(data[n1][n2]);
            }
        }
    }
}

public class twodarray {

    public static void main(String[] args) {
        matrix m1 = new matrix();
        m1.getdata();
        matrix m2 = new matrix();
        m2.getdata();
        matrix m3 = new matrix();
        m3 = m1.addmatrix(m2);
        m3.display();

    }
}
