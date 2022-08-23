def secondsToRemoveOccurrences(s):
    res = 0
    while '01' in s:
        s = s.replace('01', '10')
        res += 1
    return res


s = "001011"
print(secondsToRemoveOccurrences(s))
