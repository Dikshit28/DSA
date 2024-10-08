#
# @lc app=leetcode id=239 lang=python3
#
# [239] Sliding Window Maximum
#


# @lc code=start
import collections


class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        output = []
        deque = collections.deque()
        l = r = 0
        while r < len(nums):
            while deque and nums[r] > nums[deque[-1]]:
                deque.pop()
            deque.append(r)

            if l > deque[0]:
                deque.popleft()
            if r + 1 >= k:
                output.append(nums[deque[0]])
                l += 1
            r += 1
        return output


# @lc code=end
