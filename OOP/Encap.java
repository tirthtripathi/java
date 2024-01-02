public class Encap{
    public static void main(String[] args) {
        A obj = new A();

        obj.SetData(100);

        System.out.println(obj.GetData());
    }
}
class A {
    private int value; // Data Hiding

    public void SetData(int x)// Data abstraction
    {
        value = x;
    }

    public int GetData() {
        return value;
    }
}

