public class Selectionsort {

    /**
     * @param arr
     */
    public static void selectionsort(int[] number) {
        for (int i = 0; i< number.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[minpos] > number[j]) {
                    minpos = j;
                }
            }
            int temp = number[minpos];
            number[minpos]=number[i];
            number[i]=temp;
        }
    }
    public static void print(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 6, 3, 4 };
        selectionsort(number);
        print(number);
    }
}
