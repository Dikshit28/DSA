#
# @lc app=leetcode id=853 lang=python3
#
# [853] Car Fleet
#


# @lc code=start
class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pairs = [[p, s] for p, s in zip(position, speed)]

        st = []
        for p, s in sorted(pairs)[::-1]:
            st.append((target - p) / s)
            if len(st) > 1 and st[-1] <= st[-2]:
                st.pop()
        return len(st)


# @lc code=end
