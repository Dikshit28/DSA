def solver1(N, A, x):
    A.sort()
    count = 0
    for i in range(0, N-1):
        if(A[i] >= x):
            count += N-i-1
            continue
        j = i+1
        if(A[j] >= x):
            count += N-j
            continue
        while(j < N):

            if((abs(A[i]+A[j])+abs(A[i]-A[j])) >= x):
                count += N-j
                break
            j += 1
    return count


A1 = [10, 4, 4, 8, 9]
N1 = len(A1)
x = 8
print(solver1(N1, A1, x))
