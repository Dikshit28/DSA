#
# @lc app=leetcode id=20 lang=python3
#
# [20] Valid Parentheses
#

# @lc code=start


class Solution:
    def isValid(self, s: str) -> bool:
        open_braces = ["(", "[", "{"]
        close_braces = [")", "]", "}"]

        # use a list as stack
        stack = []

        for c in s:
            if c in open_braces:
                # push an open brace onto stack
                stack.append(c)
            elif c in close_braces:
                if len(stack) == 0:
                    # no open brace, so this is not valid
                    return False

                # check that a close brace matches type that is at top of stack
                prev_open = stack[-1]
                prev_open_idx = open_braces.index(prev_open)
                close_idx = close_braces.index(c)

                if prev_open_idx == close_idx:
                    # matching open and close
                    stack.pop(-1)
                else:
                    # it's an open and close, but not same type
                    return False

        if len(stack) == 0:
            # stack should be empty if all braces match
            return True
        else:
            # something is left, so it's not all closed
            return False


# @lc code=end
