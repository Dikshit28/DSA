package ArshSheet.segmentTrees;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
public class countOfSmallerNumAfter03 {
    int n;
    int[] seg;

    public void build(int ind, int low, int high, int[] arr) {
        if (low == high) {
            seg[ind] = arr[low];
            return;
        }

        int mid = (low + high) / 2;
        build(2 * ind + 1, low, mid, arr);
        build(2 * ind + 2, mid + 1, high, arr);
        seg[ind] = seg[2 * ind + 1] + seg[2 * ind + 2];
    }

    public int query(int ind, int low, int high, int l, int r) {
        if (r < low || high < l)
            return 0;

        if (low >= l && high <= r)
            return seg[ind];

        int mid = (low + high) >> 1;
        int left = query(2 * ind + 1, low, mid, l, r);
        int right = query(2 * ind + 2, mid + 1, high, l, r);
        return left + right;
    }

    public void update(int ind, int low, int high, int i, int val) {
        if (low == high) {
            seg[ind] += val;
            return;
        }

        int mid = (low + high) / 2;
        if (i <= mid)
            update(2 * ind + 1, low, mid, i, val);
        else
            update(2 * ind + 2, mid + 1, high, i, val);
        seg[ind] = seg[2 * ind + 1] + seg[2 * ind + 2];
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int k = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            k = Math.max(k, nums[i]);
        }
        int[] freq = new int[k];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        build(0, 0, k - 1, freq);
        for (int i = 0; i < n; i++) {
            freq[nums[i]]--;
            update(0, 0, k - 1, nums[i], -1);
            ls.add(query(0, 0, k - 1, 1, nums[i] - 1));
        }
        return ls;
    }
}
