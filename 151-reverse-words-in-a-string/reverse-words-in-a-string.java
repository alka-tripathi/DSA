class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder(s);
        String ans="";
        sb.reverse();
        StringBuilder word=new StringBuilder();
        int n=sb.length();
        int r=0;
        while(r<n){
            char ch=sb.charAt(r);
           if(ch!=' '){
            word.append(ch);
           }else if(word.length()>0){
            ans+=word.reverse().toString()+" ";
           
            word.setLength(0);

           }
            r++;
        }
    if(word.length()>0){
        ans+=word.reverse().toString();
    }


        return ans.trim();
    }
}