#
# @lc app=leetcode id=3 lang=python3
#
# [3] Longest Substring Without Repeating Characters
#

# @lc code=start
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) < 2:
            return len(s)
        l = r = 0
        longest = 0
        hashMap = {}
        while r < len(s):
            while hashMap.get(s[r], 0) != 0:
                hashMap[s[l]] = hashMap.get(s[l])-1
                l += 1
            hashMap[s[r]] = hashMap.get(s[r], 0)+1
            r += 1
            longest = max(longest, r-l)
        return longest

        # @lc code=end
