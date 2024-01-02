public class Methodoverriding {
    public static void main(String[] args) {

        Deer D = new Deer();
        D.eat();
        Animal A = new Animal();
        A.eat();
    }
}

// Base class
class Animal {
    void eat() {
        System.out.println("Eat Anythig");
    }
}

//D
class Deer extends Animal {
    void eat() {
        System.out.println("Eat Grass");
    }
}