public class fibonacciDP {

    public static int fibo(int n,int dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;

        int DP[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.print(fibo(i,DP)+" ");
        }
    }
}