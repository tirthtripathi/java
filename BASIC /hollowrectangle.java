public class hollowrectangle {

    public static void hollow_rectangle(int row, int col) {
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= col; j++) {

                if (i == 1 || i == row || j == 1 || j == col) {
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }

}