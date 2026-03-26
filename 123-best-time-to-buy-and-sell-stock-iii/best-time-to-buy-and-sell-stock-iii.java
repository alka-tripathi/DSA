class Solution {
    public static int solution(int i,int arr[],int buy,int k,int [][][] dp){
        if(i==arr.length) return 0;
        if(k==0) return 0;
        if(dp[i][buy][k]!=-1) return dp[i][buy][k];

        if(buy==1){
            int take=-arr[i]+solution(i+1,arr,0,k,dp);
            int nottake=0+solution(i+1,arr,1,k,dp);
             return dp[i][buy][k]= Math.max(take,nottake);
        }else{
             int take=arr[i]+solution(i+1,arr,1,k-1,dp);
            int nottake=0+solution(i+1,arr,0,k,dp);
            return dp[i][buy][k]= Math.max(take,nottake);
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][] = new int[n][2][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solution(0,prices,1,2,dp);
        
    }
}