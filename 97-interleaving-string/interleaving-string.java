class Solution {
    public static boolean solution(int i,int j,int k,String s1,String s2,String s3,Boolean dp[][][]){
  if(k==s3.length()){
    return i==s1.length() && j==s2.length();  //true 
  }

  if(dp[i][j][k]!=null)return dp[i][j][k];

      boolean ans1=false;
      boolean ans2=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            ans1=solution(i+1,j,k+1,s1,s2,s3,dp);
        }

         if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            ans2=solution(i,j+1,k+1,s1,s2,s3,dp);
        }
        return dp[i][j][k]=ans1|| ans2;
        
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length())return false;
        int n=s1.length();
        int m=s2.length();
        int k=s3.length();
        Boolean dp[][][]= new Boolean[n+1][m+1][k+1];
        return solution(0,0,0,s1,s2,s3,dp);
        
    }
}