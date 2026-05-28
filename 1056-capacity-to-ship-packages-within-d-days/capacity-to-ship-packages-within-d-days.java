class Solution {
    public static boolean isPossible(int wt,int arr[],int days){
        int sum=0;
        int d=1;

        for(int i=0;i<arr.length;i++){
         if(arr[i]>wt)return false;
          if(sum+arr[i]>wt){
            d++;
            sum=arr[i];
           // break;
          }else{
            sum+=arr[i];
          }
        
           
        }
         if(d<=days)return true;
         return false;
    }

    public int shipWithinDays(int[] weights, int days) {

        int n=weights.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int l=0;
        int h=sum;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(mid,weights,days)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
        

    }

}