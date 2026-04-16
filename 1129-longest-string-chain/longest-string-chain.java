class Solution {
    public static boolean isPredecessor(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
         int f=0;
            int s=0;
        if(n-m==1){
           
            while(f<n){
                if(s<m && str1.charAt(f)==str2.charAt(s)){
                    f++;
                    s++;
                }else{
                    f++;
                }
            }
        }
        if(f==n && s==m)return true;
        return false;
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        //sort array with len
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int dp[]= new int[n];
        Arrays.fill(dp,1);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(isPredecessor(words[i],words[j]) && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
              if(dp[i]>maxi){
            maxi=Math.max(dp[i],maxi);
        }
        }
      
        return maxi;
    }
}