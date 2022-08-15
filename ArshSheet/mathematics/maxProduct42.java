package ArshSheet.mathematics;

import java.util.Arrays;

public class maxProduct42 {
    public static int maximumProduct(int[] nums, int k) {
        int pro = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            pro *= nums[i];
        }
        return pro;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.println(maximumProduct(nums, k));
    }
}
