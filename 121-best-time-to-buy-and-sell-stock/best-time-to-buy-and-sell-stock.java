class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        int buy=prices[0];
        int maxP=0;
        for(int i=0;i<n;i++){
          int  p=prices[i]-buy;
            maxP=Math.max(maxP,p);
            buy=Math.min(prices[i],buy);
        }
        return maxP;
        
    }
}