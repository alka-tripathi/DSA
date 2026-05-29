class Solution {
    public static boolean solution(int i,String str,List<String> wordlist,Boolean dp[]){
        if(i>=str.length())return true;

       // if(wordlist.contains(str))return true;
       if(dp[i]!=null)return dp[i];


        for(int L=i+1;L<=str.length();L++){  //len n tak jyega
            String temp=str.substring(i,L);
            if(wordlist.contains(temp) && solution(L,str,wordlist,dp)){
                     return dp[L]=true;
            }

        }
        return dp[i]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]= new Boolean[s.length()+1];
        return solution(0,s,wordDict,dp);
    }
}