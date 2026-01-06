public class abtraction{
    public static void main(String args[]){
        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang
       
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); // Animal is abstract; cannot be instantiated 
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eat");
    }

    abstract void walk();
} 

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color = "white";
    }

    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}