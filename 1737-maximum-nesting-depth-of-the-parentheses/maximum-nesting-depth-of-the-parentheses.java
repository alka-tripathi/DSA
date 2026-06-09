class Solution {
    public int maxDepth(String s) {
        int count=0;

        int maxans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')count++;
            maxans=Math.max(maxans,count);
            if(ch==')')count--;
        }
        return maxans;
        
    }
}