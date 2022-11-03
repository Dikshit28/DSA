'''Chef is given two strings AA and BB of length NN containing lowercase English letters.

Chef can rearrange both the strings in any way he wants. He wants to minimize the length of LCS (Longest Common Subsequence) of both the strings.

Find the minimum length of LCS of AA and BB if he optimally rearranges both the strings.'''


def minimise(a, b):
    fir = [0]*26
    sec = [0]*26
    for i in a:
        fir[ord(i)-ord("a")+1] += 1
    for i in b:
        sec[ord(i)-ord("a")+1] += 1
    print(fir, sec)
    ans = 0
    for i in range(26):
        ans = max(ans, min(fir[i], sec[i]))
    print(ans)


n = int(input())
for i in range(n):
    k = int(input())
    a = list(input())
    b = list(input())
    minimise(a, b)
