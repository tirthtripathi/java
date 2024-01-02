// optimize bubblesort 

public class Optimize {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }

        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5};

        bubblesort(arr);

        print(arr);
    }

}