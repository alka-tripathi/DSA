class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;

      //sort array by 2nd element
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int curr[]=pairs[0];
        int count=1;
        for(int i=1;i<n;i++){
            int start=pairs[i][0];
            if(start>curr[1]){
                count+=1;
                curr=pairs[i];

            }

        }
        return count;
        
    }
}