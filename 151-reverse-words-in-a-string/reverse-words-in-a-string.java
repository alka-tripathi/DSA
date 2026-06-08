class Solution {
    public String reverseWords(String s) {

        StringBuilder word=new StringBuilder();
        int n=s.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
              if(word.length()>0){
                  word.reverse();
                ans+=word+" ";
                word=new StringBuilder();
              }

            }else{
                word.append(ch);
            }
        }
        if(word.length()>0){
            word.reverse();
        ans+=word;
      
        }
          return ans.trim();
        
    }
}