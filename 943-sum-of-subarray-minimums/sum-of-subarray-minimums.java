class Solution {
    public static int[] nse(int arr[]){
        Stack<Integer> s = new Stack<>();
      int n=arr.length;
        int ans[]= new int[n];

        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i]=n;
            }else{
                while(!s.isEmpty() && arr[s.peek()]>arr[i]){
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
                while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
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
    
    public int sumSubarrayMins(int[] arr) {

        int n=arr.length;
        int nse[]=nse(arr);
        int pse[]=pse(arr);
        long ans=0;
         int mod=1000000007;
        for(int i=0;i<n;i++){
            int right=nse[i]-i;
            int left=i-pse[i];
           long t = ((long)arr[i] * left * right) % mod;
           ans = (ans + t) % mod;
            
        }
        return (int)ans;
    }
}