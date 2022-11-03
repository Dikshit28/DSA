def weird(k, s):
    count = k
    for i in range(k-1):
        sub = [s[i]]
        for j in range(i+1, k):
            if(s[j] > -sub[0]):
                if((j > i+1 and s[j] < s[j-1])):
                    break
                sub.append(s[j])
                count += 1
    print(count)


n = int(input())
for _ in range(n):
    k = int(input())
    s = list(map(int, input().split()))
    weird(k, s)
