package ArshSheet.arrays;

public class reversePairs22 {
    static int reversePairs(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j] * 2) {
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = { 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647 };
        System.out.println(reversePairs(nums));
    }
}
