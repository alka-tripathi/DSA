class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];


      //base case

        for(int j=0;j<amount+1;j++){
            dp[0][j]=(int)1e9;
        }
        dp[0][0]=0;
        int take=(int)1e9;

        for(int i=1;i<=n;i++){
           for( int j=0;j<=amount;j++){
      int nottake=dp[i-1][j];

             if(coins[i-1]<=j){
          take=1+dp[i][j-coins[i-1]];
  }
  dp[i][j]=Math.min(take,nottake);
            }
        }
        return dp[n][amount]==(int)1e9?-1:dp[n][amount];
        
    }
}