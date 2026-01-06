// Print all binary string  of size n  without consecutive once 
public class binarystring{
    public static void binarystring(int n,int lp,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binarystring(n-1, 0, str+"0");

        if(lp == 0){
            binarystring(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        binarystring(3,0,"");
    }
}