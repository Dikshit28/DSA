#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}
        for i in range(0, len(nums)):
            if nums[i] in mp:
                return [mp.get(nums[i]), i]
            mp[target-nums[i]] = i
            # @lc code=end
