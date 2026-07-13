import java.sql.*;
import java.util.Arrays;


public class Knapscak0_1 {
    // O(2^n)
    public static int Knapsack(int[] val, int[] wt, int w, int n){  // using recursion
        if(w == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= w){ // valid
            //inculde
            int ans1 = val[n-1]+Knapsack(val,wt,w-wt[n-1],n-1);
            //exclude
            int ans2 = Knapsack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        }
        else{ // not valid
            return Knapsack(val,wt,w,n-1);
        }
    }

    //O(n * w)
    public static int Knapsackmemo(int[] val, int[] wt, int w, int n, int[][] dp){  // using memoization
        if(w == 0 || n == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] <= w){ // valid
            //inculde
            int ans1 = val[n-1]+Knapsackmemo(val,wt,w-wt[n-1],n-1,dp);
            //exclude
            int ans2 = Knapsackmemo(val,wt,w,n-1,dp);
            dp[n][w] = Math.max(ans1,ans2);
            return dp[n][w];
        }
        else{ // not valid
            dp[n][w] = Knapsackmemo(val,wt,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static void dparray(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int Knapsacktebu(int[] val, int[] wt, int w){
        int n = val.length;
        int[][] dp = new int[n+1][w+1];

        for(int i=0;i<dp.length;i++) { //0th column
            dp[i][0] = 0;
        }
        //0th row
        Arrays.fill(dp[0], 0);


        for(int i=1;i<n+1;i++){
            for(int j = 1;j<w+1;j++){
                int value = val[i-1]; // ith item value
                int weight = wt[i-1]; // ith item weight

                if(weight <= j){ // valid
                    int includeprofite = value + dp[i-1][j-weight];
                    int excludeprofite = dp[i-1][j];

                    dp[i][j] = Math.max(includeprofite,excludeprofite);
                }else{ // invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        dparray(dp);
        return dp[n][w];
    }

    public static void main(String args[]){
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int w = 7;
        int n = val.length;
        int[][] dp = new int[n+1][w+1]; // for memoization

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println("Using recursion: "+Knapsack(val,wt,w,n));
        System.out.println("Using memoization: "+Knapsackmemo(val,wt,w,n,dp));
        System.out.println("Using Tabulation: "+ Knapsacktebu(val,wt,w));
    }
}