'''6166. Largest Palindromic Number
You are given a string num consisting of digits only.

Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num. It should not contain leading zeroes.

Notes:

You do not need to use all the digits of num, but you must use at least one digit.
The digits can be reordered.'''


def largestPalindromic(num):
    dic = {}
    s = ""
    for i in num:
        if i not in dic:
            dic[i] = 1
        else:
            dic[i] += 1
    for key, value in dic.items():
        if value % 2 == 0:
            s += key * (value // 2)
    return s+s


num = "444947137"
print(largestPalindromic(num))
