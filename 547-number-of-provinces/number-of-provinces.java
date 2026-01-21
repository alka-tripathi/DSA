class Solution {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[],int[][] arr){
        for(int i=0;i<arr.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1 ){
                    graph[i].add(new Edge(i,j,1));
                }
            }
        }
    }
    //dfs
    public static void dfs(boolean visited[],int src,ArrayList<Edge> graph[]){
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            if(!visited[e.dest]){
              
                dfs(visited,e.dest,graph);
            }
        }
    }
    public static int countDisconnectedGraph(ArrayList<Edge> graph[]){
        int count=0;
        int n=graph.length;
        boolean visited[] = new boolean[n];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                count++;
           dfs(visited,i,graph);
            }

        }
        return count;
    }
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph,isConnected);
     return  countDisconnectedGraph(graph);
        
    }
}