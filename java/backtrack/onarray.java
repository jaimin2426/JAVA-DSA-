public class onarray{

    public static void back(int str[],int n,int i){
        if(i==str.length){
            print(str);
            return; 
        }
        str[i] = n;
        back(str, n+1, i+1);
        str[i] = str[i] - 2;
    }

    public static void print(int str[]){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int str[] = new int[5];
        back(str,1,0);
        print(str);
    }
}