#
# @lc app=leetcode id=347 lang=python3
#
# [347] Top K Frequent Elements
#

# @lc code=start
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if k >= len(nums):
            return nums
        freq = {}
        rev = [[] for i in range(len(nums)+1)]
        for num in nums:
            freq[num] = freq.get(num, 0)+1
        for num, count in freq.items():
            rev[count].append(num)

        ret = []
        for i in range(len(rev)-1, 0, -1):
            for n in rev[i]:
                ret.append(n)
                if len(ret) == k:
                    return ret

            # @lc code=end
