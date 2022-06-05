def solver(nums):
    l = len(nums)
    if l == 0:
        i = 0
    else:
        i = 1
    for n in nums:
        if n > nums[i-1]:
            nums[i] = n
            i += 1
    return i


arr = [1, 2, 3, 1, 2, 3, 4, 1, 2, 3]
pos = solver(arr)
print(pos)
print(arr)
