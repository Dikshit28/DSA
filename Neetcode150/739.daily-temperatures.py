#
# @lc app=leetcode id=739 lang=python3
#
# [739] Daily Temperatures
#


# @lc code=start
class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        st = []
        output = [0] * len(temperatures)
        for i in range(len(temperatures)):
            while st and temperatures[st[-1]] < temperatures[i]:
                index = st.pop()
                output[index] = i - index
            st.append(i)
        return output


# @lc code=end
