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
    public static int largestArea(int arr[]){
        int n=arr.length;
        int nse[]=nse(arr);
        int pse[]=pse(arr);
        int maxans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int w=nse[i]-pse[i]-1;
            maxans=Math.max(maxans,w*arr[i]);
        }
        return maxans;
    }

    
    public int maximalRectangle(char[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;
        
        int h[]= new int[m];
        int maxans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    h[j]=h[j]+1;
                }else{
                    h[j]=0;
                }
            }
          maxans=Math.max(maxans,largestArea(h));

        }
        
        return maxans;

        
    }
}