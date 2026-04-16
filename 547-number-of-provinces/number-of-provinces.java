class Solution {
    public static void dfs(int curr, ArrayList<ArrayList<Integer>> adj,boolean visited[]){
        visited[curr]=true;

      ArrayList<Integer> list = adj.get(curr);
      for(int i=0;i<list.size();i++){
        int nb=list.get(i);
        if(!visited[nb]){
            dfs(nb,adj,visited);
        }
      }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n=isConnected.length;
        int m=isConnected[0].length;

        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1){
                    list.add(j);
                }

            }
            adj.add(list);
        }
        int count=0;
        boolean visited[]= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                count++;
            }
        }
        return count;
        
    }
}