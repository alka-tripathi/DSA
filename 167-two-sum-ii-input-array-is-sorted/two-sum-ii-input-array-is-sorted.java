class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]= new int[2];
        int l=0;
        int n=numbers.length;
        int r=n-1;
        //int sum=0;
        while(l<r){
           int sum=numbers[l]+numbers[r];
            if(sum>target){
               
                r--;
            }else if(sum<target){
           //sum-=numbers[l];
                l++;
            }else if(sum==target){
               return new int[]{l+1,r+1};
            }
        }
        return new int[]{-1,-1};
        
    }
}