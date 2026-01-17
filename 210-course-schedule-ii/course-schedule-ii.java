class Solution {
    public static void kahnsAlgo(ArrayList<Integer> graph[],int inDegree[],ArrayList<Integer> ans ){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
          int curr=q.remove();
          ans.add(curr);
          for(int i=0;i<graph[curr].size();i++){
            int e=graph[curr].get(i);
            inDegree[e]--;
            if(inDegree[e]==0){
                q.add(e);
            }
          }
        }

    }
    //create a graph
    public static void createGraph(int n,ArrayList<Integer> graph[],int arr[][],int inDegree[]){
    
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int course=arr[i][0];
            int prereq=arr[i][1];
            graph[prereq].add(course);
            inDegree[course]++;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int inDegree[]= new int[numCourses];
            ArrayList<Integer> graph[]=new ArrayList[numCourses];
        ArrayList<Integer> ans = new ArrayList<>();
        createGraph(numCourses,graph,prerequisites,inDegree);
        kahnsAlgo(graph,inDegree,ans);
          int result[]=new int[ans.size()];
      if (ans.size() != numCourses) {
    return new int[0];   // cycle exists
}
      
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
return result;
        
    }
}