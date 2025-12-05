class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        int r=s.length()-1;
        //String word="";
        int ans=0;
        while(r>=0){
            char ch=s.charAt(r);
            if(ch!=' '){
                //word+=ch;
                ans++;
            }else{
                break;
            }
            r--;
        }
      return ans;
    }
}