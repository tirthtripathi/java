public class StaticKeyword {
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.collegename = "ADIT";
        Student S2 = new Student();
        System.out.println(S2.collegename);
    }
}

class Student {
    String name;
    int roll;

    static String collegename;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}
