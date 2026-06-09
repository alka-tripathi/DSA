class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        String str="";
        if(n!=m)return false;
        for(int i=0;i<n;i++){
            str=s.substring(i+1)+s.substring(0,i+1);
            if(goal.equals(str))return true;
        }
        return false;
        
    }
}