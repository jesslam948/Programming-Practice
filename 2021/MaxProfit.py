class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        min_price = float("inf")
        
        for i in range(0, len(prices)):
            if prices[i] < min_price:
                min_price = prices[i]
            max_profit = max(max_profit, prices[i] - min_price)
        
        return max_profit
        
        
#         #  [7,1,5,3,6,4]
#     min ->    i 4 2 5 3
#                       j
        
#         #  [7,6,4,3,1]
#     min ->          i
#                     j
        
#         #  [3,4,7,1,5,9]
#     min ->    1 4 i 4 8
#                       j
