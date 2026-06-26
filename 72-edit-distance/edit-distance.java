class Solution {

  public static int sol(int i,int j,String s1,String s2,int dp[][]){
    if(i<0)return j+1;
    if(j<0)return i+1;
    if(dp[i][j]!=-1)return dp[i][j];

    if(s1.charAt(i)==s2.charAt(j)){
        return dp[i][j]=sol(i-1,j-1,s1,s2,dp);
    }
    int del=1+sol(i-1,j,s1,s2,dp);
    int ins=1+sol(i,j-1,s1,s2,dp);
    int rep=1+sol(i-1,j-1,s1,s2,dp);

    return dp[i][j]=Math.min(Math.min(del,ins),rep);
    
  }

    public int minDistance(String word1, String word2) {

        int n=word1.length();
        int m=word2.length();

 // int dp[][]= new int[n][m];
//   for(int i=0;i<n;i++){
//   Arrays.fill(dp[i],-1);
//   }
    //return sol(n-1,m-1,word1,word2,dp);
    int dp[][]= new int[n+1][m+1];
    dp[0][0]=0;
    for(int i=1;i<=m;i++){
        dp[0][i]=i;
    }
    for(int j=1;j<=n;j++){
        dp[j][0]=j;
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1];
            }else{
                dp[i][j]=Math.min(1+dp[i-1][j],Math.min(1+dp[i][j-1],1+dp[i-1][j-1]));
            }
        }
    }
    return dp[n][m];




        
        

    }
}