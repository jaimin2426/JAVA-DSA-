public class classesndobject{
    public static void main(String[] args) {
        Pen p1 = new Pen();  //we have created an object of pen class
        p1.setcolor("blue");
        System.out.println(p1.getcolor()); 
        p1.settip(5);
        System.out.println(p1.gettip());    
        p1.setcolor("red"); // we can also access the properties directly
        System.out.println(p1.getcolor()); 
        
        BankAccount myacc = new BankAccount();
        myacc.username  = "jaimin123";
        // myacc.password = "jaimin456"; // this will give error as password is private

        myacc.setpass("jaimin456"); // we can set password using public method
    }
}

class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        this.color = newcolor; 
    }

    int gettip(){
        return this.tip;
    }
    void settip(int newtip){
        this.tip = newtip;
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setpass(String pass){
        password = pass;
    }


}

class Student{
    String name;
    int age;
    float percentage;

    void claculateper(int phy, int che, int maths)
    {
        percentage = (phy+che+maths )/3;
    }
}