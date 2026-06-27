class Solution {
    public static int sol(int i,int arr[],int buy,int k,int dp[][][]){
        if( k==0 || i>=arr.length)return 0;

        if(dp[i][buy][k]!=-1)return dp[i][buy][k];

        if(buy==1){
            return  dp[i][buy][k]=Math.max(-arr[i]+sol(i+1,arr,0,k,dp),sol(i+1,arr,1,k,dp));
        }else{
             return dp[i][buy][k]= Math.max(arr[i]+sol(i+1,arr,1,k-1,dp),sol(i+1,arr,0,k,dp));
        }
    }
    public int maxProfit(int k, int[] prices) {

        int n=prices.length;
        int dp[][][]= new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }

        return sol(0,prices,1,k,dp);

        
    }
}