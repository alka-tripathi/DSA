class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int src,boolean vis[],boolean rec[],int check[]){

        vis[src]=true;
        rec[src]=true;
        for(int i=0;i<adj.get(src).size();i++){
        int n=adj.get(src).get(i);
        if(!vis[n]){
            if(dfs(adj,n,vis,rec,check))return true;
        }else if(rec[n])return true; //cycle found
        }
        check[src]=1;
        rec[src]=false;

return false; //not found cycle
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V=graph.length;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
      for(int j=0;j<graph[i].length;j++){
        adj.get(i).add(graph[i][j]);
      }
        }
        
        boolean vis[]= new boolean[V];
        boolean rec[]=new boolean[V];
        int check[]= new int[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                 dfs(adj,i,vis,rec,check);
            }
        }

        List<Integer> ans= new ArrayList<>();
 
        for(int i=0;i<V;i++){
            if(check[i]==1)ans.add(i);
        }
        
       return ans;
    }
}