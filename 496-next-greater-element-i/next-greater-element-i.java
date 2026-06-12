class Solution {
    public static ArrayList<Integer> nextE(int arr[]){
        Stack<Integer> s= new Stack<>();
ArrayList<Integer> ans = new ArrayList<>();
int n=arr.length;

for(int i=n-1;i>=0;i--){

       while(!s.isEmpty() && arr[i]>=s.peek()){
        s.pop();

       }
       
     if (s.isEmpty()) {
    ans.add(-1);
} else {
    ans.add(s.peek());
}

            s.push(arr[i]);


   
}
  Collections.reverse(ans);
        return ans;




            }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = nextE(nums2);
        int k=nums1.length;
        int ans[]=new int[k];
        for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                ans[i]=arr.get(j);
            }
           }
        }
        return ans;
        
    }
}