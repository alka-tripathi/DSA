class Solution {
    public static int sol(int arr[],int i,int dp[]){
           if(i==0)return arr[0];
        if(i<0)return 0;
        if(dp[i] != -1)return dp[i];

        int nt=sol(arr,i-1,dp);
        int t=arr[i]+sol(arr,i-2,dp);
        return dp[i]=Math.max(nt,t);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n+1];
        // Arrays.fill(dp,-1);
        // return sol(nums,n-1,dp);

        dp[0]=0;
        dp[1]=nums[0];

        for(int i=2;i<=n;i++){
            int nt=dp[i-1];
          
           int  t=nums[i-1]+dp[i-2];
         
            dp[i]=Math.max(nt,t);
        }
        return dp[n];

    
    }
}