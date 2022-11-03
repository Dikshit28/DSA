def check(k):
    odd = 0
    even = 0
    for i in k:
        if(i % 2 == 0):
            even += 1
        else:
            odd += 1
    print("Even: ", even)
    print("Odd: ", odd)
    if(odd >= 1 and even >= 1):
        return True
    return False


n = int(input())
for i in range(n):
    k = list(map(int, input().split()))
    if(check(k)):
        print("YES")
    else:
        print("NO")
