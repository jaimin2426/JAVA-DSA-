// "Given a “2 x n” board and tiles of size “2 x 1”, 
// count the number of ways to tile the given board using the 2 x 1 tiles. 
// (A tile can either be placed horizontally or vertically.)"

public class tilling{

    public static int tilling(int n){ //2 X n (floorsize)
        if(n==0||n==1){
            return 1;
        }
        // vertical choice
        int fn1 = tilling(n-1);
        // horizontal choice
        int fn2 = tilling(n-2);

        int result = fn1+fn2;
        return result;

    }
    public static void main(String args[]){
        System.out.println(tilling(4));

    }
}