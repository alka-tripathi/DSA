class Solution {
    public static int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
 
    public static int dfs(int[][] grid ,int i,int j){
    if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
    return 1;
    }
    int ans=0;
    if(grid[i][j]==-1) return 0;

    grid[i][j]=-1;


    for (int k = 0; k < 4; k++) {
            int new_i = direction[k][0] + i;
            int new_j = direction[k][1] + j;
            ans += dfs(grid, new_i, new_j);
        }
        return ans;
 
        
    }

    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
   
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==1){
               return dfs(grid,i,j);
               }
            }
        }
        return -1;
        
    }
}