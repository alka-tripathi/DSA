class Solution {
    //next smaller to left
    public static ArrayList<Integer> nsl(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(i);
            

        }
        return ans;
    }

    //next smallest to right
    public static ArrayList<Integer> nsr(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()  && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.add(n);
            }else{
            ans.add(st.peek());
            }
            st.push(i);

        }
    Collections.reverse(ans);
    return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> nsl=nsl(arr);
        ArrayList<Integer> nsr=nsr(arr);
        long mod=1_000_000_007;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            int l=i-nsl.get(i);
            int r=nsr.get(i)-i;
            long total=l*r;
            ans=(ans+(total%mod*arr[i]))%mod;
        }
        return (int)ans;
    }
}