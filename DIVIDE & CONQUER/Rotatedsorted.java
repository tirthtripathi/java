public class Rotatedsorted {

    private static int search(int arr[], int target, int si, int ei) {

        int mid = si + (ei - si) / 2;

        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a
            if (arr[si] <= target && target <= arr[mid]) {
               return search(arr, target, si, mid-1);
            }else{
            // case b
            return search(arr, target, mid+1, ei);
            }
        }
        // mid on L2
        else {
            //case c 
            if (arr[mid] <= target && target <=arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                //case d
                return search(arr, target, si, mid-1);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output -> 4

        int targetindx = search(arr, target, 0, arr.length - 1);
        System.out.println(targetindx);
    }
}