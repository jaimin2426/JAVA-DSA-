public class constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name  = "jaimin";
        s1.roll = 23;
        s1.password = "8912";
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 88;


        Student s2 = new Student(s1);

        s2.password = "4567";
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }



        // Student s2 = new Student("jaimin");
        // Student s3 = new Student(123);
        // // System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    // // shallow copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }
    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Student(){
        // this.name = name;
        System.out.println("Constructor called");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
        
    }
}