class Solution {
    public static int solution(int i,int arr[],int dp[]){
          if(i==arr.length-1) return arr[arr.length-1];
       if(i>=arr.length) return 0;
       if(dp[i] != -1) return dp[i];
     
       int take=arr[i]+solution(i+2,arr,dp);
       int not_take=solution(i+1,arr,dp);
       
        return dp[i]= Math.max(take,not_take);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);

        return solution(0,nums,dp);
        
    }
}