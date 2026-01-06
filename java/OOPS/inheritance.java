public class inheritance{
    public static void main(String args[]){
        Dog pet = new Dog();
        pet.eat();
        pet.legs = 4;
        System.out.println("Dog has "+ pet.legs + " legs");
        
    }
}


// base class
class Animal{
    void eat(){
        System.out.println("eating...");
    }
    void breathe(){
        System.out.println("breathing...");
    }
}
// // derived class
// class Fish extends Animal{

//     int fins;
//     void bark(){
//         System.out.println("barking...");
//     }
// }


// // multi level inheritance
// class Mamal extends Animal {
//     int legs;
// }
// class Dog extends Mamal {
//     String breed;
// }


// hierarchical inheritance

class Mamal extends Animal {
    void walk(){
        System.out.println("walking...");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swimming");
    }
}

class Bird extends Animal {
    void walk(){
        System.out.println("bird walking...");
    }
}