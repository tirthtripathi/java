
import java.util.*;

public class Atleasttwice {
    // Approach 1 - Brute Force time complexity O(n^2)
    public static boolean atleasttwice1(int arr[]) {
        int i = 0;

        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Approach 2 - using Sets (O(n))
    /*
     * You should have a basic knowledge about Java HashSets before following
     * Approach 2. It w illbetaught to you in later chapters.
     */

    public static boolean atleasttwice2(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };

        System.out.println(atleasttwice1(arr));
        System.out.println(atleasttwice2(arr));

    }

}
