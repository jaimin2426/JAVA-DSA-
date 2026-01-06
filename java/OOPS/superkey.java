public class superkey{
    public static void main(String args[]){
        Horse h = new Horse();
        System.err.println(h.color);
    }
}

class Animal{

    String color;

    Animal(){
        System.err.println("Animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "white";
        System.out.println("Horse constructor called");
    }
}