#
# @lc app=leetcode id=238 lang=python3
#
# [238] Product of Array Except Self
#

# @lc code=start
from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = (len(nums))*[1]
        fixer = 1
        for i in range(len(nums)-1):
            fixer *= nums[i]
            ans[i+1] *= fixer

        fixer = 1
        for i in range(len(nums)-1, 0, -1):
            fixer *= nums[i]
            ans[i-1] *= fixer

        return ans

        # @lc code=end
