def distinctAverage(lst):
    lst.sort()
    i = 0
    j = len(lst)-1
    sums = 0
    count = 0
    while i < j:
        if sums != 0 and sums != lst[i]+lst[j]:
            count += 1
        sums = lst[i]+lst[j]
        i += 1
        j -= 1
        print(sums)

    return count


lst = [4, 1, 4, 0, 3, 5]
print(distinctAverage(lst))
