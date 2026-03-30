class Solution {
    //nextSmallest elements
    public static ArrayList<Integer> nse(int arr[]){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(n);
            }else{
                ans.add(s.peek());
            }
            s.push(i);

        }
          Collections.reverse(ans);
        return ans;
    }

    //previous smallest numvber
    public static ArrayList<Integer> pse(int arr[]){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
        ans.add(-1);
            }else{
                ans.add(s.peek());

            }
            s.push(i);
        }
      //  Collections.reverse(ans);
        return ans;
    }
    public int largestRectangleArea(int[] heights) {

        ArrayList<Integer> nse1= nse(heights);
         ArrayList<Integer>  pse1 = pse(heights);
         int maxArea=Integer.MIN_VALUE;
         for(int i=0;i<nse1.size();i++){
            int w=(nse1.get(i)-pse1.get(i))-1;
            maxArea=Math.max(maxArea,heights[i]*w);
         }
return maxArea;
        
    }
}