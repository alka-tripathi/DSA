class Solution {
    public static String reverse(String str){
        char arr[]=str.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            char temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
    public static int sol(int i,int j,String s1,String s2){
        if(i<0 || j<0)return 0;

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+sol(i-1,j-1,s1,s2);
        }

        return Math.max(sol(i-1,j,s1,s2),sol(i,j-1,s1,s2));
    }
    public int longestPalindromeSubseq(String s) {
      String sr=reverse(s);
      int n=s.length();
      int m=sr.length();
       // return sol(n-1,m-1,s,sr);
       int dp[][]= new int[n+1][m+1];
       for(int i=0;i<=m;i++){
        dp[0][i]=0;
       }
       for(int i=0;i<=n;i++){
        dp[i][0]=0;
       }
       for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s.charAt(i-1)==sr.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
            

        }
       }
       return dp[n][m];
        
    }
}