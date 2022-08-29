from bisect import bisect


class Solution:
    def answerQueries(nums, queries):
        nums.sort()

        pref = [0] * (len(nums) + 1)
        for i, num in enumerate(nums):
            pref[i + 1] = pref[i] + num

        return [bisect(pref, query) - 1 for query in queries]

    nums = [4, 5, 2, 1]
    queries = [3, 10, 21]
    print(answerQueries(nums, queries))
