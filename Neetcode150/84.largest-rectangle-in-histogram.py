#
# @lc app=leetcode id=84 lang=python3
#
# [84] Largest Rectangle in Histogram
#


# @lc code=start
class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        monoStack = []  # [index,height]
        maxArea = 0
        for index, height in enumerate(heights):
            newIndex = index
            while monoStack and monoStack[-1][1] > height:
                # calc max area
                idx, hght = monoStack.pop()
                maxArea = max(maxArea, hght * (index - idx))
                newIndex = idx

            monoStack.append([newIndex, height])

        for index, height in monoStack:
            maxArea = max(maxArea, height * (len(heights) - index))
        return maxArea


# @lc code=end
