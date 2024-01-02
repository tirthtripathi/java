public class Multilevelinharitance {
    public static void main(String[] args) {

        Dog tom = new Dog();
        tom.legs = 4;
        System.out.println(tom.legs);
    }
}

class Animal {
    String color;

    void eat() { 
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}