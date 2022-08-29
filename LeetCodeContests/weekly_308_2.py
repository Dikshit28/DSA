class Solution:
    def removeStars(s):
        out = []
        for c in s:
            if c == "*":
                out.pop()
            else:
                out.append(c)
        return "".join(out)

    s = "leet**cod*e"
    print(removeStars(s))
