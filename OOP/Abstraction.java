public class Abstraction {

    public static void main(String[] args) {

        Horse H = new Horse();
        H.eat();
        H.walk();
        System.out.println(H.color); // color is brown
        H.changecolor();
        System.out.println(H.color); // color change to black

        Chicken C = new Chicken();
        C.eat();
        C.walk();

        Mustang myhorse = new Mustang();
        myhorse.eat();
        // Animal -> Horse -> Mustang
    }
}

// this is the example of abstract classes,
// we can't create object(instance) ofs abstract calss
abstract class Animal {
    String color;
    // constructon in side the abstract class


    // Animal() {
    //     System.out.println("Animal constructor called \n");
    // }

    void eat() {
        System.out.println("Animal eats \n");
    }

    // this is the example of abstract method
    // Abstract method should not contain emplementation ,
    abstract void walk();
    // every sub class of animal must have walk class
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called \n");
    }

    void changecolor() {
        color = "black";
    }

    // here in sub class we give the body of method
    void walk() {
        System.out.println("Walks on four legs \n");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called \n");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "white";
    }

    void walk() {
        System.out.println("Walks on two legs \n");
    }
}