import java.util.*;

public class nto1print{
    public static void printnto1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        
        System.out.print(n+" ");
        printnto1(n-1);
        
    }

    public static void nto1incorder(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        nto1incorder(n-1);
        System.out.print(n+" ");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // printnto1(n);
        nto1incorder(n);
    }
}