#
# @lc app=leetcode id=121 lang=python3
#
# [121] Best Time to Buy and Sell Stock
#

# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        buyPrice = float('inf')
        maxProfit = 0
        for currPrice in prices:
            if buyPrice > currPrice:
                buyPrice = currPrice
            elif currPrice-buyPrice > maxProfit:
                maxProfit = currPrice-buyPrice
        return maxProfit

        # @lc code=end
