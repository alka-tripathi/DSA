class Solution {
    public static int sol(int i,int arr[],int dp[]){
        if(i>=arr.length-1)return 0;
int ans=Integer.MAX_VALUE;
if(dp[i]!=-1)return dp[i];

for(int j=1;j<=arr[i];j++){
    int temp=sol(j+i,arr,dp);
    if(temp!=Integer.MAX_VALUE){
        ans=Math.min(ans,1+temp);
    }

}
return dp[i]=ans;
    }
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
        return sol(0,nums,dp);
    }
}