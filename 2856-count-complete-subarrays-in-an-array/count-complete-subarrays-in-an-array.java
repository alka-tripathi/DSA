class Solution {
    public static int atMost(int arr[],int k){
        int count=0;
       
        for(int i=0;i<arr.length;i++){
             HashSet<Integer> set = new HashSet<>();
             for(int j=i;j<arr.length;j++){
                set.add(arr[j]);
                if(set.size()<=k){
                    count++;
                }
             }

        }
        return count;
    }
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=set.size();

        return atMost(nums,k)-atMost(nums,k-1);
        
    }
}