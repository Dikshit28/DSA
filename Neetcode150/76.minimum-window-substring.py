#
# @lc app=leetcode id=76 lang=python3
#
# [76] Minimum Window Substring
#


# @lc code=start
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t:
            return ""

        countT, window = {}, {}
        for c in t:
            countT[c] = countT.get(c, 0) + 1
        have = 0
        need = len(countT)
        l = 0
        res, resLen = [-1, -1], float("inf")
        for r in range(len(s)):
            c = s[r]
            window[c] = window.get(c, 0) + 1

            if c in t and window[c] == countT[c]:
                have += 1

            while have == need:
                if (r - l + 1) < resLen:
                    res = [l, r]
                    resLen = r - l + 1
                window[s[l]] -= 1
                if s[l] in countT and window[s[l]] < countT[s[l]]:
                    have -= 1
                l += 1
        l, r = res
        return s[l : r + 1] if resLen != float("inf") else ""
        # @lc code=end
