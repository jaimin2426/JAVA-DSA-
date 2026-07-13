package DP.level3;
/* same code as an Unbounded knapsack
rod cutting  unbounded knapsack
length      =      wt
price       =      val
total length =      w
* Given a rod of length n inches and an array of price that includes prices of all pieces size
smaller that n.
* Determine the maximum value obtainable by cutting the rod ad selling the prices.
*/
public class RodCutting { // O(n * w)
    public static int rodcut(int val[],int wt[],int w){
        int n = val.length;
        int dp[][] = new int[n+1][w+1];

        //by default initialization with 0
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<w+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1] <= j){ // valid
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                }else {//invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        dparray(dp);
        return dp[n][w];
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
    public static void main(String[] args) {

        int[] length = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        int totalroadlength = 8;
        System.out.println(rodcut(price,length,totalroadlength));
    }
}