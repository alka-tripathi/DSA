class Solution {
    public static boolean isPossible(int mid,int arr[],int h){
        long hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=(long)Math.ceil((double)arr[i]/mid);
        }
       if(hours<=h)return true;
       return false;
    }
    public static int maxE(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=maxE(piles);
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,piles,h)){
                ans=mid;
                r=mid-1;
            }else{
            l=mid+1;
            }

        }
        return ans;
        
    }
}