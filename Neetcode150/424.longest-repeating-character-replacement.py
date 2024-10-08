#
# @lc app=leetcode id=424 lang=python3
#
# [424] Longest Repeating Character Replacement
#

# @lc code=start
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = right = max_count = 0
        window = [0] * 26
        while right < len(s):
            ch = ord(s[right]) - ord('A')
            right += 1
            window[ch] += 1
            if window[ch] > max_count:
                max_count = window[ch]
            while right - left > k + max_count:
                ch_left = ord(s[left]) - ord('A')
                left += 1
                window[ch_left] -= 1
        return right - left

# @lc code=end
