class Solution {
    public static int sol(int i,int arr[],int buy,int fee,int dp[][]){
    
    if(i>=arr.length)return 0;

    if(dp[i][buy]!=-1)return dp[i][buy];

   
   if(buy==1){
    return dp[i][buy]=Math.max(-arr[i]+sol(i+1,arr,0,fee,dp),sol(i+1,arr,1,fee,dp));
   }else{
    return dp[i][buy]=Math.max(arr[i]+sol(i+1,arr,1,fee,dp)-fee,sol(i+1,arr,0,fee,dp));
   }

    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]= new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(0,prices,1,fee,dp);
        
    }
}