class StockSpanner {
    public static class pair{
        int val;
        int span;
        public pair(int val,int span){
            this.val=val;
            this.span=span;
        }
    }
    public static Stack<pair> s;

    public StockSpanner() {
      s = new Stack<>();
        
    }
    
    public int next(int price) {
        int span=1;
        while(!s.isEmpty() && s.peek().val<=price){
            span+=s.peek().span;
            s.pop();
        }
        s.push(new pair(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */