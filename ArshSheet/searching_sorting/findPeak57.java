package ArshSheet.searching_sorting;

public class findPeak57 {
    public static int findPeakElement(int[] nums) {
        return peak(nums, 0, nums.length - 1);
    }

    static int peak(int[] nums, int low, int high) {
        if (low == high) {
            return low;
        }
        int mid1 = (low + high) / 2;
        int mid2 = mid1 + 1;

        if (nums[mid1] > nums[mid2]) {
            return peak(nums, low, mid1);
        } else {
            return peak(nums, mid2, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        System.out.println(findPeakElement(nums));
    }
}
