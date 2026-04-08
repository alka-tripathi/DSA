class Solution {
    public static String reverse(String s){
        char arr[]=s.toCharArray();
        int l=0;
        int n=arr.length;
        int r=n-1;
        while(l<=r){
            //swap
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }

    public static int solution(int i,int j,String s1,String s2){
        if(i>=s1.length() || j>=s2.length())return 0;

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solution(i+1,j+1,s1,s2);
        } return Math.max(solution(i+1,j,s1,s2),solution(i,j+1,s1,s2));

    }
    public int longestPalindromeSubseq(String s) {
        String rev=reverse(s);

       // return solution(0,0,s,rev);
       int n=s.length();


       int dp[][]= new int[n+1][n+1];

       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==rev.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
       }
        return dp[n][n];
    }
}