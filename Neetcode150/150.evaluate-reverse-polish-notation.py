#
# @lc app=leetcode id=150 lang=python3
#
# [150] Evaluate Reverse Polish Notation
#


# @lc code=start
class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        for token in tokens:
            if token == "+":
                st.append(int(st.pop()) + int(st.pop()))
            elif token == "-":
                st.append((int(st.pop()) * -1) + int(st.pop()))
            elif token == "*":
                st.append(int(st.pop()) * int(st.pop()))
            elif token == "/":

                st.append((int(st.pop()) ** -1) * int(st.pop()))
            else:
                st.append(token)
        return int(st.pop())


# @lc code=end
