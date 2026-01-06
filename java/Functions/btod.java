public class btod{

    public static void btod(int n){
        int a = n;
        int pow =0;
        int decimal =0;

        while(n>0){
            int lastdegit = n%10;

            decimal = decimal + (lastdegit * (int )Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+a+" = "+ decimal);
    }

    public static void dtob(int n){
        int a = n;
        int pow =0;
        int binary =0;

        while(n>0){
            int rem  = n%2;
            binary = binary + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2; 
        }
        System.out.println("decimal of "+a+" = "+ binary);
    }
    public static void main(String args[]){
        dtob(5);
    }
}