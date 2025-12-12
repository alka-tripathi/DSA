class Solution {
    public static boolean isPossible(int arr[],int days,int capacity){
        int d=1;
        int sum=0;
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]>capacity) return false;

            if(arr[i]+sum <= capacity){
                sum+=arr[i];
            }else{
                sum=arr[i];
                d++;

            }
         
        }
        return d<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
      
        int ans=-1;
        int sum=0;
        int l=0;
        for(int i=0;i<weights.length;i++){
            l=Math.min(l,weights[i]);
            sum+=weights[i];
        }
        int h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(weights,days,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}