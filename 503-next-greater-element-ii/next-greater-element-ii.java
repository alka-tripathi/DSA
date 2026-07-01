class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(nums[i]);
       }
       for(int i=0;i<n;i++){
             list.add(nums[i]);
       }
       int ans[]= new int[n];
       int temp[]= new int[list.size()+1];
       Stack<Integer> s = new Stack<>();
       
       int m=n*2;

      int k=0;
       for(int i=m-1;i>=0;i--){
         if(s.isEmpty()){
            temp[i]=-1;
         }else{
            while(!s.isEmpty() && s.peek()<=list.get(i)){
             s.pop();
            }
            if(s.isEmpty()){
                temp[i]=-1;
            }else{
                temp[i]=s.peek();
            }
         }
         s.push(list.get(i));
       }
       for(int i=0;i<n;i++){
        ans[i]=temp[i];
       }
       return ans;


        
    }
}