class Solution {
    public static class Pair{
        char val;
        int count;

        public Pair(char val,int count){
            this.val=val;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {

        Stack<Pair> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && stack.peek().val==ch){
               stack.peek().count++;
               if(stack.peek().count==k){
                stack.pop();
               }
            }else{
                stack.push(new Pair(ch,1));
            }
          
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            Pair p=stack.pop();
           
            for(int i=1;i<=p.count;i++){
                ans.append(p.val);
            }
        }
        return ans.reverse().toString();
        
    }
}