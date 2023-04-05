d = []


def Solve(s):
    if s not in d:
        d.append(s)
        return "NO"
    return "YES"


N = int(input())

for _ in range(N):
    S = input()
    out_ = Solve(S)
    print(out_)
