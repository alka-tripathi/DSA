class Solution {
    public static boolean isPossible(int arr[],int mid,int h){
        int hours=0;
        for(int i=0;i<arr.length;i++){
            
            hours+=(arr[i]+mid-1)/mid;
            if(hours>h) return false;
        }
        return hours<=h;
    }
    public static int maxVal(int arr[]){
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxval=Math.max(arr[i],maxval);
        }
        return maxval;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int ans=-1;
        int r=maxVal(piles);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(piles,mid,h)){
                ans=mid;
            r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
        
    }
}