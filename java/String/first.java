// import java.util.*;

public class first{

    public static void printletters(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // char ch[] = {'a','b','c','d'};
        String str = "jaimin";
        // String str2 = new String("jamin patel");

        // // Strings are IMMUTABLE
        // String str3 = sc.nextLine();
        // System.out.println(str3);
        // System.out.println(str2.length());

        String name = str;
        printletters(name);
    }
}