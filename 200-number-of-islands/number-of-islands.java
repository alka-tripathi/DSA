class Solution {
    public static class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
static int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public static void bfs(char grid[][],boolean visited[][],int i,int j){
        Queue<Pair> q = new LinkedList<>();
         int n=grid.length;
    int m=grid[0].length;
      q.add(new Pair(i,j));
      while(!q.isEmpty()){
        Pair currnode = q.remove();
        int i1=currnode.i;
        int j1=currnode.j;
        visited[i1][j1]=true;
        for(int k=0;k<4;k++){
            int new_i=direction[k][0]+i1;
            int new_j=direction[k][1]+j1;
            if(new_i>=0 && new_i<n && new_j>=0 && new_j<m && grid[new_i][new_j]=='1' && !visited[new_i][new_j]){
                q.add(new Pair(new_i,new_j));
                 visited[new_i][new_j] = true;
            }
        }
      }
    }
    public int numIslands(char[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
    boolean[][] visited=new boolean[n][m];
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && !visited[i][j]){
                count++;
                bfs(grid,visited,i,j);
            }
        }
    }
    return count;
        
    }
}