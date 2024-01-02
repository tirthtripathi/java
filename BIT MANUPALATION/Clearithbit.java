// make ith bit ZERO
class Clearithbit{

    public static int clearbit(int n, int i) {
        int bitmast = ~(1<<i);
        return n & bitmast;
    }
    public static void main(String[] args) {
       System.out.println( clearbit(10, 1));
    }
}