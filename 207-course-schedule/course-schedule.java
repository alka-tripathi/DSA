class Solution {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    // create graph
    public static void createGraph( ArrayList<Edge> graph[],int arr[][]){
        int n=graph.length;
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<arr.length;i++){
           int u=arr[i][0];
           int v=arr[i][1];
         graph[v].add(new Edge(v,u));

        }

    }
    public static boolean isCycle(ArrayList<Edge> graph[],int indegree[]){
int count=0;
     Queue<Integer> q = new LinkedList<>();
     for(int i=0;i<indegree.length;i++){
        if(indegree[i]==0){
            q.add(i);
        }
     }
     while(!q.isEmpty()){
        int curr=q.remove();
         count++;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            indegree[e.dest]--;
             if(indegree[e.dest]==0){
         
            q.add(e.dest);
            
          }
        }
     }
     return count==graph.length?true:false;

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //canFinish if there is no graph --> implementing kahns algo 
        int m=prerequisites.length;
        if(m==0)return true;

        //first step convert the edges intp graph
        ArrayList<Edge> graph[]=new ArrayList[numCourses];
        createGraph(graph,prerequisites);
        int indegree[]=new int[numCourses];
        //calculate indegree
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }

        return isCycle(graph,indegree);
        
    }
}