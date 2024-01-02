public class Updateithbit {
    // clear ith bit
    public static int clearbit(int n, int i) {
        int bitmast = ~(1 << i);
        return n & bitmast;
    }

    // set ith bit
    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // Update bit
    public static int updateithbit1(int n, int i, int newbit) {
        if (newbit == 0) {
            return (clearbit(n, i));
        } else {
            return (setithbit(n, i));
        }
    }

    private static int updateithbit2(int n, int i, int newbit) {
        n = clearbit(n, i);

        int bitmask = newbit << i;

        return n | bitmask;
    }

    public static void main(String[] args) {

        // logic 1
        System.out.println(updateithbit1(10, 2, 1));
        // logic 2
        System.out.println(updateithbit2(10, 2, 1));
    }
}
