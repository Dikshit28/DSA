#
# @lc app=leetcode id=242 lang=python3
#
# [242] Valid Anagram
#

# @lc code=start
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        mp = 26*[0]
        for i in range(0, len(s)):
            mp[ord(s[i])-ord('a')] += 1
            mp[ord(t[i])-ord('a')] -= 1
        for value in mp:
            if value:
                return False
        return True
# @lc code=end
