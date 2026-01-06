public class fectorial{

    public static int fect(int n){
        if(n==0){
            return 1;
        }
        return n*fect(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fect(n));
    }
}
