class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int prev_idx[]= new int[n];
        int count[]= new int[n];

        Arrays.sort(nums);
          Arrays.fill(count, 1);

            for (int i = 0; i < n; i++) {
            prev_idx[i] = i;     
        }
    
    int lastIndx=0;
    int maxlen=1;

        for(int i=0;i<n;i++){

            for(int prev=0;prev<i;prev++){
              if(nums[i]%nums[prev]==0 && count[i]<count[prev]+1){
                count[i]=count[prev]+1;
                prev_idx[i]=prev;
              }
            }
            if(count[i]>maxlen){
                maxlen=count[i];
                lastIndx=i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(prev_idx[lastIndx]!=lastIndx){
            ans.add(nums[lastIndx]);
            lastIndx=prev_idx[lastIndx];
        }

       ans.add(nums[lastIndx]); 
        Collections.reverse(ans);
        return ans;
        
    }
}