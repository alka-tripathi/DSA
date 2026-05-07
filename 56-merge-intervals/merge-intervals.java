class Solution {
    
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans= new ArrayList<>();
        int curr[]=intervals[0];
        int n=intervals.length;

        for(int i=1;i<n;i++){
            int end=curr[1];
            int start=intervals[i][0];
            if(end >= start){
                curr[1]=Math.max(curr[1],intervals[i][1]);
               

            }else{
                ans.add(curr);
                curr=intervals[i];
            }
            

        }
        ans.add(curr);
        int result[][]= new int[ans.size()][2];
      
       
        return ans.toArray(new int[ans.size()][]);
    }
}