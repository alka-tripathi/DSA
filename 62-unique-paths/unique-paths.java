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
        int i=0;
        int j=0;
        int dp[][]=new int[n][m];
        for(int k=0;k<n;k++){
            for(int l=0;l<m;l++){
                dp[k][l]=-1;
            }
        }
        return solution(i,j,m,n,dp);
        
    }
}