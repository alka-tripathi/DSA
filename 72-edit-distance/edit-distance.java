class Solution {
    public static int solution(int i,int j,String str1,String str2,int dp[][]){
      
        if(i==0)return j;  //s1 get exhauted
        if(j==0) return i;
if(dp[i][j]!= -1)return dp[i][j];

        if(str1.charAt(i-1)==str2.charAt(j-1)){
            return dp[i][j]= solution(i-1,j-1,str1,str2,dp);
        }
           int min1=Math.min(1+solution(i,j-1,str1,str2,dp),1+solution(i-1,j,str1,str2,dp));
           return dp[i][j]=Math.min(min1,1+solution(i-1,j-1,str1,str2,dp));
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n==0 && m==0){
            return 0;
        }else if(n==0 && m!=0){
            return m;
        }else if(m==0 && n!=0){
            return n;
        }

          int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
      
      //  int ans=solution(n,m,word1,word2,dp);
      for(int i=1;i<=n;i++){
        dp[i][0]=i;
      }
      for(int j=1;j<=m;j++){
        dp[0][j]=j;
      }
      dp[0][0]=0;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1];
            }else{
                int min=Math.min(1+dp[i-1][j],1+dp[i][j-1]);
                dp[i][j]=Math.min(min,1+dp[i-1][j-1]);
            }
        }
      }
        return dp[n][m];
        
    }
}