class Solution {
    public static int solution(int i,int j,int m,int n,int dp[][]){
        if(i==n-1 && j==m-1)return 1;
        if(i>=n || j>=m)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int R=solution(i,j+1,m,n,dp);
        int D=solution(i+1,j,m,n,dp);
        dp[i][j]=R+D;
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
      
        int dp[][]=new int[m][n];
     for(int i=0;i<n;i++){  //first row
        dp[0][i]=1;
     }
       for(int j=0;j<m;j++){   //first column
        dp[j][0]=1;
       }
      for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
    
         dp[i][j]=dp[i][j-1]+dp[i-1][j];
      }
        }
      
      return dp[m-1][n-1];
        
    }
}