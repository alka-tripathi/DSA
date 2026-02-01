class Solution {
    public static int solution(int i,int j,int m,int n,int arr[][],int dp[][]){
     
        if(i>=m || j>=n || arr[i][j]==1) return 0;
          if(i==m-1 && j==n-1 )return 1;
          if(dp[i][j]!=-1 )return dp[i][j];
        int R=solution(i,j+1,m,n,arr,dp);
        int D=solution(i+1,j,m,n,arr,dp);
        dp[i][j]=R+D;
        return dp[i][j];

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;  //row
        int n=obstacleGrid[0].length; //col
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solution(0,0,m,n,obstacleGrid,dp);
        
    }
}