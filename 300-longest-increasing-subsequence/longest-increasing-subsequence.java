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
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]>arr.get(arr.size()-1)){
                arr.add(nums[i]);
                len++;
            }else{
                int idx=lowerBound(0,arr.size()-1,nums[i],arr);
                arr.set(idx,nums[i]);
            }
        }

        return len;
    }
}