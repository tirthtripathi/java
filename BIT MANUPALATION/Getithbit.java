// find that ith bit is ZERO or ONE
class Getithbit {
    public static int ithbit(int n, int i) {
           int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0; 
        } else {
           return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println( ithbit(10, 3));
    }
}