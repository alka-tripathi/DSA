class Solution {
    public static int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public static void dfs(int row,int col,char[][] grid,boolean visited[][]){
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int new_i=row+direction[i][0];
            int new_j=col+direction[i][1];
            if(new_i>=0 && new_i<grid.length && new_j>=0 && new_j<grid[0].length && !visited[new_i][new_j] && grid[new_i][new_j]=='1'){
 dfs(new_i,new_j,grid,visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
 dfs(i,j,grid,visited);
                }
            }
        }
        return count;
        
    }
}