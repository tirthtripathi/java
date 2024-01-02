public class FindSubset {
    public static void subset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Null" + " ");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        subset(str, ans+str.charAt(i), i+1);// for yes
        subset(str, ans, i+1); // for no

    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }
}
