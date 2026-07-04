class Solution {
    public int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
    public static class Pair{
        int i;
        int j;
        int dist;
        public Pair(int i,int j,int dist){
            this.i=i;
            this.j=j;
            this.dist=dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<Pair> q = new LinkedList<>();
       
        int n=mat.length;
        int m=mat[0].length;
         int ans[][]= new int[n][m];
        boolean vis[][]= new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                vis[i][j]=true;
                }
            }
        }

        while(!q.isEmpty()){
            int i=q.peek().i;
            int j=q.peek().j;
            int d=q.poll().dist;
            ans[i][j]=d;
            for(int k=0;k<4;k++){
                int new_i=direction[k][0]+i;
                int new_j=direction[k][1]+j;
                if(new_i>=0 && new_j>=0 && new_i<n && new_j<m && !vis[new_i][new_j]){
                    
                    q.add(new Pair(new_i,new_j,d+1));
                    vis[new_i][new_j]=true;
                }

            }


        }
        return ans;



    }
}