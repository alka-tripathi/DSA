class Solution {

    public static int solution(int arr[][],int i,int j,int dp[][]){
        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==arr.length-1 && j==arr[0].length-1) return arr[i][j];
        if(dp[i][j] !=-1){
            return dp[i][j];
        }
 
    
        int down=solution(arr,i+1,j,dp);
        if(down !=Integer.MAX_VALUE){
            down=arr[i][j]+down;
        }
        int right=solution(arr,i,j+1,dp);
        if(right!=Integer.MAX_VALUE){
            right=arr[i][j]+right;
        }

        return dp[i][j]= Math.min(down,right);

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
 int dp[][]= new int[n][m];
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
dp[i][j]=-1;
    }
 }
        return solution(grid,0,0,dp);
        
    }
}