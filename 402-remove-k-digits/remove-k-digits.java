class Solution {
    public String removeKdigits(String num, int k) {

        int n=num.length();
        Stack<Character> s = new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && k>0 && s.peek()>num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        //agar koi bhi na niklna ho
        while(k-->0){
            s.pop();
            
        }
        StringBuilder ans = new StringBuilder();
        while(!s.isEmpty()){
            ans.append(s.pop());
        }

    ans.reverse();
      while(ans.length() > 0 && ans.charAt(0) == '0'){
    ans.deleteCharAt(0);
}

        return ans.length()==0?"0":ans.toString();
        
    }
}