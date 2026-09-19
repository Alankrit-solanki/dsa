class Solution {
    public int maxProfit(int[] prices) {
        
        int MinPrice =prices[0];
        int Maxprofit = 0;

        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - MinPrice;
            Maxprofit = Math.max(Maxprofit, profit);
            MinPrice =Math.min(MinPrice,prices[i]); 
        }
        return Maxprofit;
    }
}