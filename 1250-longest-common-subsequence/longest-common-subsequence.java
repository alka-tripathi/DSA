class Solution {
    public static int solution(int i,int j,String str,String str2,int dp[][]){
        if(i>=str.length() || j>=str2.length()){
            return 0;
        }
if(dp[i][j]!=-1) return dp[i][j];

        if(str.charAt(i)==str2.charAt(j)){
            return 1+solution(i+1,j+1,str,str2,dp);
        }
        return  dp[i][j]= Math.max(solution(i+1,j,str,str2,dp),solution(i,j+1,str,str2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
      
int dp[][]= new int[n+1][m+1];
for(int i=0;i<=n;i++){
    for(int j=0;j<=m;j++){
        dp[i][j]=-1;
    }
}
        return solution(0,0,text1,text2,dp);
        
    }
}