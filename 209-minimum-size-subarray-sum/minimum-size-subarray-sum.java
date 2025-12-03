class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int l=0;
        int r=0;
        int n=arr.length;
        int sum=0;
        int minlen=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>=target){
                  minlen=Math.min(minlen,i-l+1);
                sum-=arr[l];
                l++;
               
            }
         
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
        
    }
}