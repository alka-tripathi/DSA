class Solution {
    public static int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public static class Pair{
        int i;
        int j;
        int step;
        public Pair(int i,int j,int step){
            this.i=i;
            this.j=j;
            this.step=step;
        }
    }
    public static void bfs(int[][] grid,int ans[][],boolean[][] visited){
         Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.add(new Pair(i,j,0));
                     visited[i][j] = true;
                }
            }
        }

          while(!q.isEmpty()){
                Pair p = q.remove();
                int i1=p.i;
                int j1=p.j;
                int s=p.step;
              
                ans[i1][j1]=s;

                for(int k=0;k<4;k++){
                    int new_i=direction[k][0]+i1;
                    int new_j=direction[k][1]+j1;
                    if(new_i>=0 && new_i<grid.length && new_j>=0 && new_j<grid[0].length && !visited[new_i][new_j]){
                        q.add(new Pair(new_i,new_j,s+1));
                          visited[new_i][new_j]=true;
                    }
                }
            
        }
    }
    public int[][] updateMatrix(int[][] mat) {
         int n=mat.length;
        int m=mat[0].length;
        boolean visited[][]=new boolean[n][m];
        int[][] ans=new int[n][m];
        bfs(mat,ans,visited);
        return ans;
        
    }
}