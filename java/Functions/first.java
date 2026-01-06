
import java.util.Scanner;
public class first{

    // public static int printhw(int a,int b){
    //     int c = a+b;
    //     return c;
    // }
    // public static int fect(int a){
    //     if(a==0||a==1){
    //         return 1;
    //     }
    //     return a * fect(a-1);
    // }

    // public static int fect(int n,int r){
    //     int a = fect(n);
    //     int b = fect(r);
    //     int c = fect(n-r);

    //      int ncr = a/(b*c);

    //      return ncr;
    // }


    // // function overloading
    // public static int sum(int a,int b){
    //     return a+b;
    // }

    // public static float sum(float a,float b,float c){
    //     return a+b+c;
    // }


    // check number is prime or not  

    public static boolean prime(int n){

        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int z = fect(a);
        // System.out.println(z);

        // nCr
        // int n =sc.nextInt();
        // int r =sc.nextInt();

        // int x = fect(n,r);

       
        // System.out.println(x);


        // System.out.println(sum(3,5));
        // System.out.println(sum(3,5,6));

        int a = sc.nextInt();
        boolean c = prime(a);

        if(c){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}