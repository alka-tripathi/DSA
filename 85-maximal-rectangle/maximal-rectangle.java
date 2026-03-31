class Solution {

    //nse
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
        return ans;
    }

    public static int largestArea(int arr[]){
        ArrayList<Integer> nse1=nse(arr);
        ArrayList<Integer> pse1=pse(arr);
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int w=(nse1.get(i)-pse1.get(i))-1;

            maxArea=Math.max(maxArea,w*arr[i]);
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {

        int n=matrix.length;
    int maxA =Integer.MIN_VALUE;
    int m=matrix[0].length;
      int[] heights = new int[m];
        int maxArea = 0;
  
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j] =='1') {
                  heights[j] += 1;

            }else{
heights[j] = 0;
            }
          
          
        }
           maxArea = Math.max(maxArea, largestArea(heights));
      }
    return maxArea;
        
    }
}