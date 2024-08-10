#
# @lc app=leetcode id=36 lang=python3
#
# [36] Valid Sudoku
#

from typing import List

# @lc code=start


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        seen = set()
        for i in range(9):
            for j in range(9):
                number = board[i][j]
                if number != '.':
                    if (number + " in row " + str(i) in seen or
                        number + " in column " + str(j) in seen or
                            number + " in block " + str(i//3) + "-" + str(j//3) in seen):
                        return False

                    seen.add(number + " in row " + str(i))
                    seen.add(number + " in column " + str(j))
                    seen.add(number + " in block " +
                             str(i//3) + "-" + str(j//3))
        return True
        # @lc code=end
