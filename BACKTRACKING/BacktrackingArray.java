public class BacktrackingArray{

    public static void Changearr(int arr[],int i,int val) {
        //bace case
        if(i == arr.length){
            printarr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        Changearr(arr, i+1, val+1); //function call
        arr[i] = arr[i]-2;  //backtracking
    }

    public static void printarr(int arr[]) {
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        int arr[] = new int [5];
        Changearr(arr, 0, 1);
        printarr(arr);
        
    }
}

// out put
// 1 2 3 4 5 
// -1 0 1 2 3