#
# @lc app=leetcode id=15 lang=python3
#
# [15] 3Sum
#

# @lc code=start
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        for a in range(len(nums)-1):
            if a > 0 and nums[a] == nums[a-1]:
                continue
            l = a+1
            r = len(nums)-1
            while l < r:
                threeSum = nums[l]+nums[r]+nums[a]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    ans.append([nums[a], nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
        return ans
# @lc code=end
