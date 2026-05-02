class Solution {
    public  int result=Integer.MAX_VALUE;
    public  void solve(int idx,int cookies[],int children[],int k){

        if(idx>=cookies.length){
            int maxCookie=0;
            for(int i=0;i<k;i++){
                maxCookie=Math.max(maxCookie,children[i]);
            }
            result=Math.min(result,maxCookie);
            return;

        }


        int cookie=cookies[idx];
        for(int i=0;i<k;i++){
            children[i]+=cookies[idx];
            solve(idx+1,cookies,children,k);
            children[i]-=cookies[idx];

        }
    }
    public int distributeCookies(int[] cookies, int k) {

        int children[]= new int[k];
        solve(0,cookies,children,k);

        return result;
        
    }
}