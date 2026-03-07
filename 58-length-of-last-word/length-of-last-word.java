class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String str ="";
        for(int i=s.length()-1;i>=0;i--){

            char ch=s.charAt(i);
                        if(ch==' '){
break;
            }
            str+=ch;

        }
        return str.length();
        
    }
}