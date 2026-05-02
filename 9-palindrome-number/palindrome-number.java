class Solution {
    public boolean isPalindrome(int x) {

        String str=Integer.toString(x);
        int l=0;
        int n=str.length();
        int r=n-1;
        while(l<=r){
            char s=str.charAt(l);
            char e=str.charAt(r);
            if(s!=e)return false;
            l++;
            r--;

        }
        return true;
        
    }
}