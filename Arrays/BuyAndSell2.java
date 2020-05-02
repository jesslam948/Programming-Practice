class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int count;
        
        for (int i = 0; i < prices.length - 1; i++) {
            count = prices[i + 1] - prices[i];
            if (count > 0) {
                profit += count;
            }
        }
        
        return profit;
    }
}
