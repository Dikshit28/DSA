def check(k, s):
    pre = []
    pre.append(s[0])
    for i in range(k-1):
        pre.append(pre[i] ^ s[i+1])
    print("ans", pre)


n = int(input())
for i in range(n):
    k = int(input())
    s = list(map(int, input().split()))
    check(k, s)
