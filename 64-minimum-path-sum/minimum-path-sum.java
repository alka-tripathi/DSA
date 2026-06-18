class Solution {
    public static int sol(int i,int j,int arr[][],int dp[][]){
        if (i < 0 || j < 0)
            return (int)1e9;

        if (i == 0 && j == 0)
            return arr[0][0];

            if(dp[i][j] !=-1) return dp[i][j];

        int up = arr[i][j] + sol(i - 1, j, arr,dp);
        int left = arr[i][j] + sol(i, j - 1, arr,dp);

        return dp[i][j]=Math.min(up, left);
    }


    public int minPathSum(int[][] grid) {

    int n=grid.length;
    int m=grid[0].length;
    int dp[][]= new int[n+1][m+1];
    for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
    }

    return sol(n-1,m-1,grid,dp);
        
    }
}