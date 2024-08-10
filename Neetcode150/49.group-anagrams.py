#
# @lc app=leetcode id=49 lang=python3
#
# [49] Group Anagrams
#

# @lc code=start

from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = {}
        for val in strs:
            sortedVal = ''.join(sorted(val))
            if sortedVal not in mp:
                mp[sortedVal] = list()
            mp[sortedVal].append(val)
        return list(mp.values())
        # @lc code=end
