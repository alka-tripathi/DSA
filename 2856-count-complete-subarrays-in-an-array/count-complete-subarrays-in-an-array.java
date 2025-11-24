class Solution {

    public static int atMostUnique(int arr[],int k){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
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

        return atMostUnique(nums,k)-atMostUnique(nums,k-1);

        
    }
}