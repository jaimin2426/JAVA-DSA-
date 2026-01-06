public class methodoverloading{
    public static void main(String args[]){
        // Calculator calc = new Calculator();
        // System.out.println("Sum of 2 integers: " + calc.sum(5, 10));
        // System.out.println("Sum of 2 floats: " + calc.sum((float)5.5, (float)10.3));
        // System.out.println("Sum of 3 integers: " + calc.sum(5, 10, 15));

        Deer d = new Deer();
        d.eat();
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}

// method overriding

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat something");
    }
}