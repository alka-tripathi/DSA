class Solution {
    public static int sol(int i,int arr[],int buy,int t,int[][][] dp){
        if(t==0 || i>=arr.length)return 0;

        if(dp[i][buy][t]!=-1){
            return dp[i][buy][t];
        }

        if(buy==1){
            return dp[i][buy][t]= Math.max(-arr[i]+sol(i+1,arr,0,t,dp),sol(i+1,arr,1,t,dp));
        }else{
            return dp[i][buy][t]= Math.max(arr[i]+sol(i+1,arr,1,t-1,dp),sol(i+1,arr,0,t,dp));
        }
    }
    public int maxProfit(int[] prices) {

          int n=prices.length;
        int dp[][][]= new int[n][2][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
     
        return sol(0,prices,1,2,dp);
     

        
    }
}