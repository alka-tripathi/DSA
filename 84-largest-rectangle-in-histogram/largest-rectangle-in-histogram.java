class Solution {
    public static int[] nse(int arr[]){
        Stack<Integer> s = new Stack<>();
        int n=arr.length;
        
        int ans[]= new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i]=n;
            }else{
                while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=n;
                }else{
                    ans[i]=s.peek();
                }
            }
            s.push(i);
        }
        return ans;


    }

      public static int[] pse(int arr[]){
        Stack<Integer> s = new Stack<>();
        int n=arr.length;
        
        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=s.peek();
                }
            }
            s.push(i);
        }
        return ans;


    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nse[]=nse(heights);
        int pse[]=pse(heights);

        int ans=0;
        for(int i=0;i<n;i++){
            int w=nse[i]-pse[i]-1;
            ans=Math.max(ans,w*heights[i]);
        }
        return ans;
    }
}