def Solve(arr):
    d = [arr[0]]
    for i in range(1, len(arr)):
        while d and arr[i] < d[-1]:
            print(d.pop(), end=" ")
        print()
        d.append(arr[i])
    while d:
        print(d.pop(), end=" ")


arr = [4, 5, 1, 2, 3]
Solve(arr)
#out_ = Solve(arr)

# for i_out_ in out_:
#print(' '.join(map(str, i_out_)))
