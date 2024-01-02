public class Countingsort {

    private static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
    }
    public static void main (String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
    }
}
