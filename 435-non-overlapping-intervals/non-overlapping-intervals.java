class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        int curr[] = intervals[0];
        int i=1;
        int count=0;
        int n=intervals.length;
        while(i<n){
            int start = intervals[i][0];
            if(curr[1]>start){
                count++;
                curr[1]=Math.min(curr[1],intervals[i][1]);
                
            }else{
                curr=intervals[i];
            }
            i++;
        }
        return count;
        
    }
}