import java.util.Scanner;

public class first{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // if(a<b){
        //     System.out.println(a +" is small "+b+"is big");
        // }
        // else{
        //     System.out.println(a+" is big "+b+" is small");
        // }

        // if(a%2 == 0){
        //     System.out.println(a + " is even");
        // }
        // else if (a<=18) {
        //     System.out.println("hi");
        // }
        // else{
        //     System.out.println(a + " is odd");
        // }

        // int income = sc.nextInt();
        // int tax;

        // if(income<500000){
        //     tax = 0;
        // }
        // else if (500000<=income && income<1000000) {
        //     tax = (int)(income * 0.2);
        // }
        // else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is "+tax);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a>b&&a>c){
        //     System.out.println(a+" is big");
        // }
        // else if(b>c){
        //     System.out.println(b+" is big");
        // }
        // else{
        //     System.out.println(c+" is big");
        // }

        // String c = a>b ? (a + " is big"):(a+" is small");
        // System.out.println(c);

        // int a = sc.nextInt();

        // switch(a)
        // {
        //     case 1:
        //         System.out.println("sunday");
        //         break;
        //     case 2:
        //         System.out.println("monday");
        //         break;
        //     case 3:
        //         System.out.println("tuesday");
        //         break;
        //     case 4:
        //         System.out.println("wednesday");
        //         break;
        //     case 5:
        //         System.out.println("thursday");
        //         break;
        //     case 6:
        //         System.out.println("friday");
        //         break;
        //     case 7:
        //         System.out.println("saturday");
        //         break;
        //     default:
        //         System.out.println("invalide choice");
            
        // }

        int year = sc.nextInt();
        if(year%4==0 && year%100!=0||year%400==0){
            System.out.println("leep year");
        }
        else{
            System.out.println("not a leep year");
        }
    }
}