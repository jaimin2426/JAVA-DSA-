import java.util.*;

public class ClimbingStairs {

    // public static int climbing(int n){  O(2^n)  // using recursion it is not suitable for big number ex for 10000000
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     return climbing(n-1)+climbing(n-2);
    // }

    public static int climbing(int n ,int dp[]){    // using memoization O(n)
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(dp[n] != -1) {  // already calculated 
            return dp[n];
        }
        dp[n] = climbing(n-1,dp)+climbing(n-2,dp);
        return dp[n];
    }

    public static int climbingtebulation(int n){
        int dp[] = new int[n+1];

        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1] +0;
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n =5;
        // System.out.println(climbing(n)); 
        int dp[] = new int[n+1]; // by default it fill 0,0,0,0,0
        Arrays.fill(dp,-1);   // now it is -1,-1,-1,-1,-1
        System.out.println("Using Memoization: "+climbing(n,dp)); 
        System.out.println("Using tebulation: "+climbingtebulation(n));
        

    }    
}
