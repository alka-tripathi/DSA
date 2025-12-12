class Solution {
    public static boolean isPossible(int arr[],int maxsum,int k){
        int a=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxsum)return false;
            if(sum+arr[i]<=maxsum){
                sum+=arr[i];
            }else{
                sum=arr[i];
                a++;
            }
        }
        return a<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int r=sum;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,mid,k)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }

        }
        return ans;
        
    }
}