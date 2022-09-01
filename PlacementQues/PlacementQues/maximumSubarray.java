package PlacementQues;

public class maximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int max_now = 0;
        for (int i = 0; i < nums.length; i++) {
            max_now += nums[i];
            max_sum = Integer.max(max_sum, max_now);
            max_now = Integer.max(0, max_now);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }
}
