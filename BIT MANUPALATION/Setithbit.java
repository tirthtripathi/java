// set ith bit ONE
class Setithbit {
    public static int ithbit(int n, int i) {
           int bitmask = 1 << i;
        return n | bitmask;

    }

    public static void main(String[] args) {
        System.out.println( ithbit(10, 2));
    }
}