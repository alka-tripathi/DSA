class Solution {
    public static boolean solution(int i,String s,int open,Boolean dp[][]){

         if(open<0)return false;
        if(i==s.length()){
            return open==0;
        }
        if(dp[i][open]!=null)return dp[i][open];

        if(s.charAt(i)=='('){
            return dp[i][open]=solution(i+1,s,open+1,dp);
        }
         if(s.charAt(i)==')'){
            return dp[i][open]=solution(i+1,s,open-1,dp);
        }

        return dp[i][open]=solution(i+1,s,open+1,dp) || solution(i+1,s,open-1,dp) || solution(i+1,s,open,dp);
    }
    public boolean checkValidString(String s) {
        int n=s.length();
      Boolean dp[][]= new Boolean[n][n];
       
        return solution(0,s,0,dp);
        
    }
}