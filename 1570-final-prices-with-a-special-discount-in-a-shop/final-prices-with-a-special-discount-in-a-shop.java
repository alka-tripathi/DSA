class Solution {
    public static  ArrayList<Integer> nextSmallestE(int arr[]){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(0);

            }else{
            ans.add(s.peek());
            }
            s.push(arr[i]);

        }
        Collections.reverse(ans);
        return ans;
    }
    public int[] finalPrices(int[] prices) {

        ArrayList<Integer> nse= nextSmallestE(prices);
        int n=prices.length;
        int ans[] = new int[n];
       

      

int k=0;
        for(int i=0;i<n;i++){
          
                ans[i]=prices[i]-nse.get(i);
            
        }
        return ans;
        
    }
}