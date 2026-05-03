class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int n=intervals.length;
        int ans=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int curr[]=intervals[0];
        for(int i=1;i<n;i++){
            int e=curr[1];
            int s=intervals[i][0];
            if(s<e){
                ans++;
            }else{
                curr=intervals[i];
            }


        }
        return ans;



        
    }
}