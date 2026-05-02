class Solution {
    public static boolean canSplit(int sum,int arr[],int k){

        int s=1;
        int n=arr.length;
        int currsum=0;
        for(int i=0;i<n;i++){
            if(currsum+arr[i]<=sum){
                currsum+=arr[i];
            }else{
                s++;
                currsum=arr[i];

                if(s>k)return false; //more than k partition is possible
            }
        }
        return true;

    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int tsum=0;
        for(int i=0;i<n;i++){
            tsum+=nums[i];
        }

        int low=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
        }
        int high=tsum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(canSplit(mid,nums,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}