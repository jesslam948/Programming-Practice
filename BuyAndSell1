class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int profit = 0;
        int count;
        
        for (int i = 1; i < prices.length; i++) {
            count = prices[i] - prices[j];
            if (count > 0) {
                profit = Math.max(profit, count);
            }
            else {
                j = i;
            }
        }
        
        return profit;
    }
}
