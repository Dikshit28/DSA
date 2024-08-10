#
# @lc app=leetcode id=42 lang=python3
#
# [42] Trapping Rain Water
#

# @lc code=start
class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        leftMax, rightMax = height[l], height[r]
        ans = 0
        while l < r:
            if leftMax < rightMax:
                l += 1
                leftMax = max(height[l], leftMax)
                ans += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(height[r], rightMax)
                ans += rightMax-height[r]
        return ans
# @lc code=end
