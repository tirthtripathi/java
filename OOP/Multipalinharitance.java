// we can not implament multipal inharitance diractly in java 
// for this we have to use interface 
public class Multipalinharitance {
    public static void main(String[] args) {
       
        Bear B = new Bear();
        B.eat();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements Carnivore, Herbivore {
   
    public void eat(){
        System.out.println("Veg , Non-Veg both");
    }
}