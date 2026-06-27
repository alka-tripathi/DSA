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
 int dp[][]= new int[prices.length+1][2];
 for(int i=0;i<prices.length;i++){
    Arrays.fill(dp[i],-1);
 }
      return sol(0,prices,1,dp);
        
    }
}