def solver(arr):
    i = 0
    j = 0
    k = len(arr)-1
    while i <= k:
        if arr[i] == 0:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i += 1
            j += 1
        elif arr[i] == 2:
            temp = arr[i]
            arr[i] = arr[k]
            arr[k] = temp
            k -= 1
        else:
            i += 1


arr = [1, 2, 1, 1, 0, 0, 0, 2, 1, 2]
solver(arr)
print(arr)
