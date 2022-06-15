def solve(N, A):
    for i in range(0, N):
        preor = A[i]
        j = i+1
        size = 1
        while(j < N):
            if(A[j] != 0 and preor % A[j] == 0):
                j += 1
                continue
            if(preor < preor | A[j]):
                preor = preor | A[j]
                size = j-i+1
            else:
                size = min(size, j-i+1)
            j += 1
        A[i] = size
    return A


def solver(N, A):
    for i in range(0, N):
        preor = A[i]
        A[i] = 1
        size = 1
        while(size+i < N):
            if(preor < preor | A[size+i]):
                preor = preor | A[size+i]
                A[i] = size+1
            size += 1
    return A


A = [7, 8, 5, 3, 3]
N = len(A)
# print(solve(N, A))
print(solver(N, A))
