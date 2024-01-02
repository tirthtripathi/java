public class Sumofnum {
    public static int Sum (int n) {
        
        if( n == 1 ){
            return 0;
        }

        int sum  = n + Sum(n-1) ;
        return sum;
    }
    public static void main(String[] args) {
      System.out.println(Sum(5));
    }
}
