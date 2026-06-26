class Solution {
    public static void dfs(int u,boolean vis[], ArrayList<ArrayList<Integer>> arr){

        vis[u]=true;
        for(int i=0;i<arr.get(u).size();i++){
            if(!vis[arr.get(u).get(i)]){
                dfs(arr.get(u).get(i),vis,arr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {

        //given --> Adj Matrix
        ArrayList<ArrayList<Integer>> adjM = new ArrayList<>();
        int n=isConnected.length;
        int m=isConnected[0].length;

        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1){
                    list.add(j);
                }
            }
            adjM.add(list);
        }

int count=0;
        boolean vis[]= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,adjM);
                count++;
            }
        }
        return count;
        
    }
}