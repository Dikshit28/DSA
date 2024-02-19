package ArshSheet.segmentTrees;

//https://leetcode.com/problems/range-sum-query-immutable/
public class rangeSumQuery01 {
    int[] seg;
    int n;

    public rangeSumQuery01(int[] nums) {
        int n = nums.length;
        seg = new int[4 * n];
        build(0, 0, n - 1, nums);
    }

    public void build(int index, int low, int high, int[] nums) {
        if (low == high) {
            seg[index] = nums[low];
            return;
        }
        int mid = (low + high) / 2;
        build(2 * index + 1, low, mid, nums);
        build(2 * index + 2, mid + 1, high, nums);
        seg[index] = seg[2 * index + 1] + seg[2 * index + 2];
    }

    public int sumRange(int left, int right) {
        return sumRange(0, 0, n - 1, left, right);
    }

    public int sumRange(int index, int low, int high, int left, int right) {
        if (high < left || low > right) {
            return 0;
        } else if (low >= left && high <= right) {
            return seg[index];
        }
        int mid = (low + high) / 2;
        int l = sumRange(2 * index + 1, low, mid, left, right);
        int r = sumRange(2 * index + 2, mid + 1, high, left, right);
        return l + r;
    }
}
