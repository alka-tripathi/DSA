class Solution {
    public static int lowerBound(int l,int h,int target,ArrayList<Integer> arr){
int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)>=target){
                ans=mid;
               h=mid-1;
            }else{
            l=mid+1;
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
        int len=1;
        int n=nums.length;
        // ArrayList<Integer>arr = new ArrayList<>();
        // arr.add(nums[0]);
        // for(int i=1;i<n;i++){
        //     if(nums[i]>arr.get(arr.size()-1)){
        //         arr.add(nums[i]);
        //         len++;
        //     }else{
        //         int idx=lowerBound(0,arr.size()-1,nums[i],arr);
        //         arr.set(idx,nums[i]);
        //     }
        // }
        int dp[]= new int[n];
        Arrays.fill(dp,1);
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev]){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
return maxi;
        //return len;
    }
}