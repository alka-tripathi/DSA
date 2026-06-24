class Solution {
    public static int sol(int i,int j,String str1,String str2,int dp[][]){
        if(j<0)return 1;
        if(j>=0 && i<0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];
        
        if(str1.charAt(i)==str2.charAt(j)){
           return dp[i][j]=sol(i-1,j-1,str1,str2,dp)+sol(i-1,j,str1,str2,dp);
        }
        return dp[i][j]=sol(i-1,j,str1,str2,dp);
    }
    public int numDistinct(String s, String t) {
int n=s.length();
int m=t.length();
int dp[][]= new int[n][m];
for(int i=0;i<n;i++){
Arrays.fill(dp[i],-1);
}
        return sol(n-1,m-1,s,t,dp);
        
    }
}