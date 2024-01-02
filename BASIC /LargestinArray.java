class LargestinArray {
   private static int largestinarray(int array[]) {
    int max=Integer.MIN_VALUE;   
    for(int i=0;i<=array.length;i++)
       {
         
           if(max<array[i])
           {
            max = array[i];
           }
       }
       return max;
   }

    public static void main(String[] args) {
        int array[] = { 1, 4, 5, 12, 9 };
     System.out.println("largest value is:"+largestinarray(array));
    }
}
