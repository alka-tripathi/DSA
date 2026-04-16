class Solution {
    public int findLongestChain(int[][] pairs) {

        //sort arr
        int n=pairs.length;
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int len=1;
        int curr[]=pairs[0];
        
        for(int i=1;i<n;i++){
            int start=pairs[i][0];
            if(start>curr[1]){
                curr=pairs[i];
                len++;
            }
        }
        return len;

        
        
    }
}