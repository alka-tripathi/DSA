class Solution {
    public static int sol(int i,int arr[],int buy,int dp[][]){
        if(i>=arr.length)return 0;
        if(dp[i][buy]!=-1)return dp[i][buy];

     if(buy==1){
        return dp[i][buy]= Math.max(-arr[i]+sol(i+1,arr,0,dp),sol(i+1,arr,1,dp));
     }else{
        return dp[i][buy]=Math.max(arr[i]+sol(i+1,arr,1,dp),sol(i+1,arr,0,dp));
     }


    }
    public int maxProfit(int[] prices) {
 // not buy=1 ,buy=0

//  for(int i=0;i<prices.length;i++){
//     Arrays.fill(dp[i],-1);
//  }
//       return sol(0,prices,1,dp);
int n=prices.length;

int[][] dp = new int[n + 1][2];

dp[n][0] = 0;
dp[n][1] = 0;

for (int i = n - 1; i >= 0; i--) {
    dp[i][1] = Math.max(
        -prices[i] + dp[i + 1][0],
        dp[i + 1][1]
    );

    dp[i][0] = Math.max(
        prices[i] + dp[i + 1][1],
        dp[i + 1][0]
    );
}

return dp[0][1];
        
    }
}