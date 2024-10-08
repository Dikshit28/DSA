#
# @lc app=leetcode id=567 lang=python3
#
# [567] Permutation in String
#

# @lc code=start
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        charMap1, charMap2 = [0] * 26, [0] * 26

        for i in range(len(s1)):
            charMap1[ord(s1[i]) - ord('a')] += 1
            charMap2[ord(s2[i]) - ord('a')] += 1

        for i in range(len(s1), len(s2)):
            if charMap1 == charMap2:
                return True

            charMap2[ord(s2[i]) - ord('a')] += 1
            charMap2[ord(s2[i - len(s1)]) - ord('a')] -= 1

        # Check the last window
        return charMap1 == charMap2
# @lc code=end
