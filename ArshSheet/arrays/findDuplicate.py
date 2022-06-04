def finder(arr):
    cnt = [0 for x in range(len(arr))]
    for i in arr:
        cnt[i] += 1
        if cnt[i] > 1:
            return i
    return -1


arr = [1, 2, 3, 4, 4, 6]
print(finder(arr))
