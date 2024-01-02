public class HierarchialInheritance {

    public static void main(String[] args) {

        Mammal dog = new Mammal();
        dog.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats..");
    }

    void breathe() {
        System.out.println("breathes..");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walks..");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim..");
    }
}
class Bird extends Animal{
    void Fly(){
        System.out.println("Fly..");
    } 
}