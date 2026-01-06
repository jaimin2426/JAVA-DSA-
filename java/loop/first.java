import java.util.Scanner;
public class first{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int sum = 0;
        // int a = sc.nextInt();
        // while(a>=i){
        //     sum += i;
        //     i++;
        // }
        // System.out.print(sum);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<b;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int a = sc.nextInt();
        // for(int i=a;i>=0;i--){
        //     System.out.println(i);
        // }

        // int s = 0;
        // int a = 0; 
        // do { 
        //     System.out.println(a);
        //     if(a==3){
        //         break;
        //     }
        //     a++;
        // } while (a<5);

        // do{
        //     System.out.println("Enter your number: ");
        //     int a = sc.nextInt();
        //     if(a%10==0){
        //         break;
        //     }
        //     System.out.println(a);
        // }
        // while(true);
        

        // int a = sc.nextInt();

        // for(int i=0;i<a;i++){
            
        //     if(i==3){
        //         continue;
        //     }

        //     System.out.println(i);
        // }

        
        // do { 
        //     System.out.println("Enter a number :");
        //     int a = sc.nextInt();    
        //     if(a%10==0){
        //         continue;
        //     }
        //     if(a>50){
        //         break;
        //     }
        //     System.out.println("Your number : "+a);
        // } while (true);


        // Prime or not 
        // int a = sc.nextInt();
        // int j = 0;
        // for(int i=2;i<a;i++){
        //     if(a%i==0){
        //         j = 1;
        //     }
        // }
        // int k = 0;
        // if(k == j){
        //     System.err.println("it is a prime number :");
        // }
        // else{
        //     System.out.println("not a prime number ");
        // }

        // int a = sc.nextInt();
        // int fect = 1;
        // for(int i=a;i>0;i--){
        //     fect *= i;
        // }
        
        // System.out.println(fect);

        int a = 6;
        char b = 'A';
        for(int i=1;i<a;i++){
            for(int j=1;j<i;j++){
                
                System.out.print(b++);
            }
            System.out.println();
        }

    }
}