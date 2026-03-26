class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxP=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
              if(buy>prices[i]){
                buy=prices[i];
            }
            if(maxP<prices[i]){
                maxP=Math.max(prices[i]-buy,maxP);
            }
          

        }
        return maxP==Integer.MIN_VALUE?0:maxP;
        
    }
}