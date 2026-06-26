class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
           boolean isVisited[][]= new boolean[n][m];

        for(int i=0;i<grid.length;i++){
           for(int j=0;j<m;j++){
             if(grid[i][j]==2){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);

                q.add(list);
                  isVisited[i][j] = true;
            }
           }
        }
       
     
        int count=-1;

        while(!q.isEmpty()){
         
         

          //up
           int size=q.size();
           while(size-->0){

               ArrayList<Integer> list= q.poll();
           
            int i=list.get(0);
            int j=list.get(1);
             if(i-1>=0 && !isVisited[i-1][j] && grid[i-1][j]==1){
                 ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i-1);
                temp.add(j);
                q.add(temp);
                grid[i-1][j]=2;
                isVisited[i-1][j]=true;
            }

             if(j-1>=0 && !isVisited[i][j-1] && grid[i][j-1]==1){
                 ArrayList<Integer> temp = new ArrayList<>();
               temp.add(i);
                temp.add(j-1);
                q.add(temp);
                grid[i][j-1]=2;
                isVisited[i][j-1]=true;
            }

             if(i+1<n && !isVisited[i+1][j] && grid[i+1][j]==1){
                 ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i+1);
                temp.add(j);
                q.add(temp);
                grid[i+1][j]=2;
                isVisited[i+1][j]=true;
            }

             if(j+1<m && !isVisited[i][j+1] && grid[i][j+1]==1){
                 ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j+1);
                q.add(temp);
                grid[i][j+1]=2;
                isVisited[i][j+1]=true;
            }
           }
               count++;
        }
        // return count;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)return -1;
            }
        }

     return Math.max(0, count);
        
    }
}