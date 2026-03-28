class Solution {
    public static int solution(int i,int arr[],int len,int dp[]){
      
        if(i>len) return 0;
        if(dp[i]!=-1) return dp[i];

        int take=arr[i]+solution(i+2,arr,len,dp);
        int not_take=solution(i+1,arr,len,dp);
        return dp[i]=Math.max(take,not_take);

        
    }
    public int rob(int[] nums) {

        //agar phela loge toh last nai le paaoge
        
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solution(0,nums,n-2,dp2),solution(1,nums,n-1,dp));
        
    }
}