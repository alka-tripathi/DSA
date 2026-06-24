class Solution {

public static String reverse(String str){
    char arr[]= str.toCharArray();
    int l=0;
    int r=arr.length-1;
    while(l<=r){
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    return new String(arr);
}
    public int minInsertions(String s) {
        int n=s.length();
        String rev=reverse(s);
        int m=rev.length();

        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<=m;j++){
            dp[j][0]=0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int ans=dp[n][m];
        return n-ans;
        
    }
}