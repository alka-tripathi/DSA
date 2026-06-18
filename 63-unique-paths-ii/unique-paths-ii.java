class Solution {
    public static int sol(int i,int j,int arr[][],int dp[][]){
    
        if(i<0 || j<0 || arr[i][j]==1)return 0;
            if(i==0 && j==0)return 1;
        
   if(dp[i][j]!=-1) return dp[i][j];
        int left=sol(i-1,j,arr,dp);
        int up=sol(i,j-1,arr,dp);
        return dp[i][j]=left + up;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length; //row
        int m=obstacleGrid[0].length; //column
        if(n==1 && m==1){
            if(obstacleGrid[0][0]==1)return 0;
            return 1;
        }
        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(n-1,m-1,obstacleGrid,dp);
        
    }
}