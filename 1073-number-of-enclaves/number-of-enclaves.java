class Solution {
    public static int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public static void dfs(int row,int col,int[][] arr ,boolean visited[][]){
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int new_i=row+direction[i][0];
            int new_j=col+direction[i][1];
            if(new_i>=0 && new_i<arr.length && new_j>=0 && new_j<arr[0].length && !visited[new_i][new_j] && arr[new_i][new_j]==1){
                dfs(new_i,new_j,arr,visited);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(0,i,grid,visited);
            }
            if(grid[n-1][i]==1){
                dfs(n-1,i,grid,visited);
            }

        }

        //column mai jao
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                   dfs(i,0,grid,visited);
            }
            if(grid[i][m-1]==1){
                   dfs(i,m-1,grid,visited);
            }
        }
int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
        
    }
}