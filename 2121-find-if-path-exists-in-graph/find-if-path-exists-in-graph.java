class Solution {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
                    }
    }
    public static void createGraph( ArrayList<Edge> graph[],int arr[][]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
        int u=arr[i][0];
        int v=arr[i][1];
        graph[u].add(new Edge(u,v));
          graph[v].add(new Edge(v, u)); //as this graph is undirected
        }
    }
    //dfs -->
    public static boolean dfs(ArrayList<Edge> graph[],int src,int dest,boolean visited[]){
        visited[src]=true;
        if(src==dest) return true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest] && dfs(graph,e.dest,dest,visited) ){
                return true;
               
            }
        }
        return false;

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //create a graph
     
        ArrayList<Edge> graph[]=new ArrayList[n];
        boolean isVisited[]=new boolean[n];
        createGraph(graph,edges);

       return dfs(graph,source,destination,isVisited);
        
    }
}