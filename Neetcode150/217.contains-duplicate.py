#
# @lc app=leetcode id=217 lang=python3
#
# [217] Contains Duplicate
#

# @lc code=start
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set(nums)
        if len(seen) != len(nums):
            return True
        return False
# @lc code=end
