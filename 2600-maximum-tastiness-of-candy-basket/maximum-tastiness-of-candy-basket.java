class Solution {
    public static boolean isPossible(int arr[],int mid,int k){
        int n=arr.length;
        int count=1;
       int last=arr[0];
       for(int i=1;i<n;i++){
        if(arr[i]-last >= mid){
            count++;
            last=arr[i];
        }
       }
        return count>=k;

    }
    public int maximumTastiness(int[] price, int k) {
       
        Arrays.sort(price);
        int n=price.length;

      
        int l=1;
        int r=price[n-1]-price[0];
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(price,mid,k)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}