#
# @lc app=leetcode id=11 lang=python3
#
# [11] Container With Most Water
#

# @lc code=start
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        maxHeight = max(height)
        l, r = 0, len(height)-1
        while l < r:
            area = ((r-l)*min(height[l], height[r]))
            maxArea = max(area, maxArea)
            bestArea = (r-l)*maxHeight
            if maxArea >= bestArea:
                return maxArea
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxArea
# @lc code=end
