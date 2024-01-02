

// method one
/*public class RevarseNumber {
   public static void main(String args[]) {

       int n =642004;
       
       while(n > 0)
       {
           int rev = n%10;
           System.out.print(rev);
           n = n/10;   
       }
       System.out.println();
   }
}*/

//method two
public class RevarseNumber {
    public static void main(String args[]) {

        int n = 642004;
        int rev = 0;
        while(n>0)
        {
            int lastdigit=n%10;
            rev = (rev * 10)+ lastdigit;
            n = n/10;
        }
       System.out.println(rev);
    }
}